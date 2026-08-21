package com.dycle.maxcursos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dycle.maxcursos.entities.User;
import com.dycle.maxcursos.repositories.UserRepository;

@Service
public class UserService {

	private final UserRepository repository;  // dependencia do userRepository

	UserService(UserRepository repository) {
		this.repository = repository;
	}
		
	public List<User> findAll(){   //metodo para retornar todos os usuarios
		return repository.findAll();
	}
	public User findById(Long id) {
		 Optional<User> obj = repository.findById(id);
		 return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}

}
