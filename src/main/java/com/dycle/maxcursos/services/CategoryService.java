package com.dycle.maxcursos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dycle.maxcursos.entities.Category;
import com.dycle.maxcursos.repositories.CategoryRepository;

@Service
public class CategoryService {

	private final CategoryRepository repository;  // dependencia do userRepository

	CategoryService(CategoryRepository repository) {
		this.repository = repository;
	}
		
	public List<Category> findAll(){   //metodo para retornar todos as categorys
		return repository.findAll();
	}
	public Category findById(Long id) {
		 Optional<Category> obj = repository.findById(id);
		 return obj.get();
	}
}
