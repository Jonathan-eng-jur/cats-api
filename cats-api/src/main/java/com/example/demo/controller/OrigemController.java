package com.example.demo.controller;

import java.util.ArrayList;

//IMPORTS
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
@RequestMapping("/origem")
@CrossOrigin("*")
public class OrigemController {

    @GetMapping
    public ResponseEntity<ArrayList<String>> get(){
        
    	//ENDPOINT DA API CATS QUE O OBJETO DE GATOS
        String urlApi = "https://api.thecatapi.com/v1/breeds?api_key=bfb85c73-fe0e-40ed-976f-1062aeae5f0c";
        
        //CLASSE TEMPLATE DE METODO HTTP
        RestTemplate restTemplate = new RestTemplate();

        //RETORNO DA CHAMADA DA API
        Raca[] result = restTemplate.getForObject(urlApi, Raca[].class);

        //INSTANCIANDO LISTA DE ORIGENS QUE SERÃO ARMAZENADAS NO BANCO
        ArrayList<String> listaOrigem = new ArrayList<String>();

        //PERCORRENDO LISTA GATOS
        for(Raca raca : result){
        	
        	//VERIFICANDO SE O VALOR JA EXISTE NA LISTA
            if(listaOrigem.contains(raca.getOrigin())){ //JA EXISTE

            }else{//NAO EXISTE
            	
            	//INSERINDO DADO NA LISTA
                listaOrigem.add(raca.getOrigin());
            }            
        }

        //RETORNANDO LISTA DE ORIGEM E STATUS HTTP PARA O CLIENTE
        return new ResponseEntity<>(listaOrigem, HttpStatus.OK);        
    }

    @GetMapping("/")
    @ResponseBody
    public ResponseEntity<ArrayList<String>>  getRaca(@RequestParam String origem) {

    	//ENDPOINT DA API CATS QUE O OBJETO DE GATOS
        String urlApi = "https://api.thecatapi.com/v1/breeds";
        
        //CLASSE TEMPLATE DE METODO HTTP
        RestTemplate restTemplate = new RestTemplate();

        //RETORNO DA CHAMADA DA API
        Raca[] result = restTemplate.getForObject(urlApi, Raca[].class);

        //INSTANCIANDO LISTA DE RACAS QUE SERA ENVIADA PARA O CLIENTE
        ArrayList<String> listaRacas = new ArrayList<String>();

        //PERCORRENDO LISTA GATOS
        for(Raca raca : result){
        	
        	//VERIFICANDO SE A ORIGEM DO GATO É IGUAL A ORIGEM PROCURADA
            if(raca.getOrigin().equals(origem)){
            	
            	//VERIFICANDO SE JA EXISTE O NOME DA RACA NA LISTA
                if(listaRacas.contains(raca.getName())){//JA EXISTE

                }else{ //NAO EXISTE
                	
                	//ADICIOANDO RACA A LISTA DE RACAS QUE SERA ENVIADA PARA O CLIENTE
                    listaRacas.add(raca.getName());
                }
            }                    
        } 
        
        //RETORNANDO LISTA DE RACAS E STATUS HTTP PARA O CLIENTE
        return new ResponseEntity<>(listaRacas, HttpStatus.OK);
    }

}