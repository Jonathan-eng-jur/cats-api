package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Imagem;

public interface ImagemRepository extends JpaRepository<Imagem, String> {

}
