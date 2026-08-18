package com.dycle.maxcursos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dycle.maxcursos.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
