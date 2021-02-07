package com.example.demo.controller;

//IMPORTS
import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Raca;


@RestController
@RequestMapping("/racas")
@CrossOrigin("*")
public class RacaController {

    @GetMapping
    public ResponseEntity<ArrayList<String>> get(){

    	//ENDPOINT DA API CATS QUE O OBJETO DE GATOS
        String urlApi = "https://api.thecatapi.com/v1/breeds?api_key=bfb85c73-fe0e-40ed-976f-1062aeae5f0c";
        
        //CLASSE TEMPLATE DE METODO HTTP
        RestTemplate restTemplate = new RestTemplate();

        //RETORNO DA CHAMADA DA API
        Raca[] result = restTemplate.getForObject(urlApi, Raca[].class);

        //INSTANCIANDO LISTA DE RACAS QUE SERA ENVIADA PARA O CLIENTE
        ArrayList<String> listaRacas = new ArrayList<String>();

        //PERCORRENDO LISTA GATOS
        for(Raca raca : result){
            
        	//VERIFICANDO DE O NOME DA RACA EXISTE NA LISTA
            if(listaRacas.contains(raca.getName())){//JA EXISTE

            }else{//NAO EXISTE
            	
            	//INSERINDO NOME DA RACA NA LISTA DE RACA
                listaRacas.add(raca.getName());
            }
            
        }

        //RETORNANDO LISTA DE RACAS E STATUS HTTP PARA O CLIENTE
        return new ResponseEntity<>(listaRacas, HttpStatus.OK);
        
    }
    
    
    @GetMapping("/gato")
    @ResponseBody
    public ResponseEntity<Raca>  getRaca(@RequestParam String raca) {

        String urlApi = "https://api.thecatapi.com/v1/breeds?api_key=bfb85c73-fe0e-40ed-976f-1062aeae5f0c";
        
        RestTemplate restTemplate = new RestTemplate();

        Raca[] result = restTemplate.getForObject(urlApi, Raca[].class);

        Raca racaSelecionada = new Raca();

        for(Raca item : result){
            if(item.getName().equals(raca)){
                racaSelecionada = item;
            }
        }
        
        return new ResponseEntity<>(racaSelecionada, HttpStatus.OK);
    }

}
