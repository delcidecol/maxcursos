package com.dycle.maxcursos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dycle.maxcursos.entities.Order;
import com.dycle.maxcursos.repositories.OrderRepository;

@Service
public class OrderService {

	private final OrderRepository repository;  // dependencia do userRepository

	OrderService(OrderRepository repository) {
		this.repository = repository;
	}
		
	public List<Order> findAll(){   //metodo para retornar todos os usuarios
		return repository.findAll();
	}
	public Order findById(Long id) {
		 Optional<Order> obj = repository.findById(id);
		 return obj.get();
	}
}
