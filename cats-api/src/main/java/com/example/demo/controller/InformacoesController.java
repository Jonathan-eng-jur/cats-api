package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Informacoes;
import com.example.demo.model.Raca;
import com.example.demo.repository.InformacoesRepository;

@RestController
@RequestMapping("/informacoes")
@CrossOrigin("*")
public class InformacoesController {
		
	//INJETOU O REPOSITÓRIO INFORMACOES PARA COMUNICAR COM O BANCO DE DADOS
	@Autowired
	private InformacoesRepository repository;
		
	@PostMapping 
	public ResponseEntity<String> criar(@RequestBody Informacoes informacoes){
		
		//ENDPOINT DA API CATS QUE O OBJETO DE GATOS
		String urlApi = "https://api.thecatapi.com/v1/breeds?api_key=bfb85c73-fe0e-40ed-976f-1062aeae5f0c";
        
		//CLASSE TEMPLATE DE METODO HTTP
        RestTemplate restTemplate = new RestTemplate();

        //RETORNO DA CHAMADA DA API
        Raca[] result = restTemplate.getForObject(urlApi, Raca[].class);
        
        //PERCORRENDO LISTA GATOS
        for(Raca raca : result){
        	
        	//INSTANCIANDO OBJETO DE INFORMAÇÃO QUE SERA ARMAZENADO NO BANCO
        	Informacoes info = new Informacoes();
        	
        	//SETANDO VALORES NO OBJETO DE INFORMAÇÃO QUE SERA ARMAZENADO NO BANCO
        	info.setName(raca.getName());
    		info.setOrigin(raca.getOrigin());
    		info.setTemperament(raca.getTemperament());
    		info.setDescription(raca.getDescription());    		
    		
    		//INSERINDO DADOS NO BANCO
    		ResponseEntity.status(HttpStatus.CREATED).body(repository.save(info));
           
        }
        
        //RETORNANDO MENSAGEM DE SUCESSO E STATUS HTTP PARA O CLIENTE
		return new ResponseEntity<>("INFORMAÇÕES CADASTRADAS COM SUCESSO", HttpStatus.OK);	
	}
	
}
