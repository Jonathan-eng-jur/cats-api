package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Informacoes;


public interface InformacoesRepository extends JpaRepository<Informacoes, String> {
	
}
