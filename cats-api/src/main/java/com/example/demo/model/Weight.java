package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weight {        

	//ATRIBUTOS
    private String imperial;    
    private String metric;

    Weight(){}

    //GETTERS E SETTERS
    public void setImperial(String imperial) {
		this.imperial = imperial;
	}
	
	public String getImperial(){
		return this.imperial;
    }
    
    public void setMetric(String metric) {
		this.metric = metric;
	}
	
	public String getMetric(){
		return this.metric;
    }
}