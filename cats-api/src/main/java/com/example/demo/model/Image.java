package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Image {        

	//ATRIBUTOS
    private String id;
    private int width;
    private int height;
    private String url;

    Image(){}

    //GETTERS E SETTERS
    public void setId(String id) {
		this.id = id;
	}
	
	public String getId(){
		return this.id;
    }

    public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth(){
		return this.width;
    }

    public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight(){
		return this.height;
    }

    public void setUrl(String url) {
		this.url = url;
	}
	
	public String getUrl(){
		return this.url;
    }
    
}