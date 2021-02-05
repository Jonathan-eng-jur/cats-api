package com.example.demo.controller;


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
@RequestMapping("/temperamento")
@CrossOrigin("*")
public class TemperamentoController {

    @GetMapping
    public ResponseEntity<ArrayList<String>> get(){
        
    	//ENDPOINT DA API CATS QUE O OBJETO DE GATOS
        String urlApi = "https://api.thecatapi.com/v1/breeds?api_key=bfb85c73-fe0e-40ed-976f-1062aeae5f0c";
        
        //CLASSE TEMPLATE DE METODO HTTP
        RestTemplate restTemplate = new RestTemplate();

        //RETORNO DA CHAMADA DA API
        Raca[] result = restTemplate.getForObject(urlApi, Raca[].class);

        //LISTA DE TEMPERAMENTOS QUE SERA RETORNADA PARA O CLIENTE
        ArrayList<String> listaDeTemperamento = new ArrayList<String>();

        //PERCORRENDO A LISTA DE GATOS
        for(Raca raca : result){
        	
        	//SEPARANDO OS TEMPERAMENTOS POR VIRGULA E COLOCANDO NA LISTA DE TEMPERAMENTO
            String[] arrayDeTemperamento = raca.getTemperament().split(", ");
            
            //PERCORRENDO A LISTA DE TEMPERAMENTO
            for(String item : arrayDeTemperamento){
            	
            	//VERIFICANDO SE O TEMPERAMENTO EXISTE NA LISTA
                if(listaDeTemperamento.contains(item)){//EXISTE
    
                }else{//NAO EXISTE
                	
                	//INSERINDO TEMPERAMENTO NA LISTA DE TEMPERAMENTO
                    listaDeTemperamento.add(item);
                }            
            }
            
        }

        //RETORNANDO LISTA DE TEMPERAMENTO E STATUS HTTP PARA O CLIENTE
        return new ResponseEntity<>(listaDeTemperamento, HttpStatus.OK);
        
    }

    @GetMapping("/")
    @ResponseBody
    public ResponseEntity<ArrayList<String>>  getRaca(@RequestParam String temperamento) {

    	//ENDPOINT DA API CATS QUE O OBJETO DE GATOS
        String urlApi = "https://api.thecatapi.com/v1/breeds";
        
        //CLASSE TEMPLATE DE METODO HTTP
        RestTemplate restTemplate = new RestTemplate();

        //RETORNO DA CHAMADA DA API
        Raca[] result = restTemplate.getForObject(urlApi, Raca[].class);

        //LISTA DE RACAS QUE SERA RETORNADA PARA O CLIENTE
        ArrayList<String> listaRacas = new ArrayList<String>();

        //PERCORRENDO A LISTA DE GATOS
        for(Raca raca : result){
        	
        	//SEPARANDO OS TEMPERAMENTOS POR VIRGULA E COLOCANDO NA LISTA DE TEMPERAMENTO
            String[] arrayDeTemperamento = raca.getTemperament().split(", ");
            
            //PERCORRENDO A LISTA DE TEMPERAMENTO
            for(String item : arrayDeTemperamento){  
            	
            	//VERIFICANDO SE O TEMPERAMENTO É IGUAL AO INFORMADO PELO CLIENTE
                if(item.contains(temperamento)){//MESMO INFORMADO
                	
                	//ADICIONANDO RACA A LISTA DE RACAS QUE SERA RETORNADA PARA O CLIENTE
                    listaRacas.add(raca.getName());
                    
                }else{//NAO E O MESMO
                    
                }            
            }
            
        }        
        
        //RETORNANDO LISTA DE RACAS E STATUS HTTP PARA O CLIENTE
        return new ResponseEntity<>(listaRacas, HttpStatus.OK);
    }

}