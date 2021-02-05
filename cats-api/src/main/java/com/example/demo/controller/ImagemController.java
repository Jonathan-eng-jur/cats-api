package com.example.demo.controller;

//IMPORTS
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Imagem;
import com.example.demo.model.Raca;
import com.example.demo.repository.ImagemRepository;

@RestController
@RequestMapping("/imagens")
@CrossOrigin("*")
public class ImagemController {

	//INJETOU O REPOSITÓRIO IMAGEM PARA COMUNICAR COM O BANCO DE DADOS
	@Autowired
	private ImagemRepository repository;
			
	@PostMapping 
	public ResponseEntity<String> criar(@RequestBody Imagem imagem){
		
		//ENDPOINT DA API CATS QUE O OBJETO DE GATOS
		String urlApi = "https://api.thecatapi.com/v1/breeds?api_key=bfb85c73-fe0e-40ed-976f-1062aeae5f0c";
        
		//CLASSE TEMPLATE DE METODO HTTP
        RestTemplate restTemplate = new RestTemplate();

     	//RETORNO DA CHAMADA DA API
        Raca[] result = restTemplate.getForObject(urlApi, Raca[].class);
        
        //INSTANCIANDO LISTA DE IMAGENS QUE SERÃO ARMAZENADAS NO BANCO
        ArrayList<Imagem> listaImagens = new ArrayList<Imagem>();       
        
        //PERCORRENDO DE IMAGENS QUE SERÃO ARMAZENADAS NO BANCO
        for(Raca raca : result){
        	
        	//INSTANCIANDO OBJETO IMAGEM QUE SERA ARMAZENADO NO BANCO
        	Imagem info = new Imagem();
        	
        	//VERIFICANDO SE EXISTE DADOS NO OBJETO QUE RETORNA DA API
        	if(raca.getName() != null && raca.getImage() != null) {
        		info.setName(raca.getName());        	
        		info.setUrlImagem(raca.getImage().getUrl());
        		
        		//INSERINDO DADOS NO BANCO
        		ResponseEntity.status(HttpStatus.CREATED).body(repository.save(info)); 
        	}        		          
        }
        
        //RETORNANDO MENSAGEM DE SUCESSO E STATUS HTTP PARA O CLIENTE
		return new ResponseEntity<>("IMAGENS CADASTRADAS COM SUCESSO", HttpStatus.OK);	
	}
		
}
