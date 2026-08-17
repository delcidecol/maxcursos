package com.dycle.maxcursos.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dycle.maxcursos.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Maria do Carmo","du-ca@hotmail.com", "98788888", "123456");
		return ResponseEntity.ok().body(u);
	}
}
