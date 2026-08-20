package com.dycle.maxcursos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dycle.maxcursos.entities.Product;
import com.dycle.maxcursos.repositories.ProductRepository;

@Service
public class ProductService {

	private final ProductRepository repository;  // dependencia do productRepository

	ProductService(ProductRepository repository) {
		this.repository = repository;
	}
		
	public List<Product> findAll(){   //metodo para retornar todos os usuarios
		return repository.findAll();
	}
	public Product findById(Long id) {
		 Optional<Product> obj = repository.findById(id);
		 return obj.get();
	}
}
