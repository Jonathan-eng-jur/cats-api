package com.example.demo.controller;

//IMPORTS
import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Categoria;

@RestController
@RequestMapping("/categorias")
@CrossOrigin("*")
public class CategoriaController {
	
	//METODO RESPONSAVEL POR LISTAR AS CATEGORIAS
	@GetMapping
    public ResponseEntity<ArrayList<String>> get(){
        
		//ENDPOINT DA API CATS QUE LISTA AS CATEGORIAS
        String urlApi = "https://api.thecatapi.com/v1/categories?api_key=bfb85c73-fe0e-40ed-976f-1062aeae5f0c";
        
        //CLASSE TEMPLATE DE METODO HTTP
        RestTemplate restTemplate = new RestTemplate();

        //RETORNO DA CHAMADA DA API
        Categoria[] result = restTemplate.getForObject(urlApi, Categoria[].class);

        //INSTANCIANDO LISTA QUE ARMAZERA AS CATEGORIAS
        ArrayList<String> listaCategorias = new ArrayList<String>();

        //PERCORRENDO LISTA QUE ARMAZERA AS CATEGORIAS
        for(Categoria categoria : result){
        	
        	//ADICIONANDO CATEGORIA A LISTA DE CATEGORIAS
        	listaCategorias.add(categoria.getName());
        }
        
        //RETORNANDO LISTA DE CATEGORIRAS E STATUS HTTP PARA O CLIENTE
        return new ResponseEntity<>(listaCategorias, HttpStatus.OK);
        
    }

}
