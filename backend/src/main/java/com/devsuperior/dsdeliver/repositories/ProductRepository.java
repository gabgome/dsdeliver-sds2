package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliver.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	/*Método que busca todos os produtos ordenados por nome em ordem crescente*/
	List<Product> findAllByOrderByNameAsc();
}
