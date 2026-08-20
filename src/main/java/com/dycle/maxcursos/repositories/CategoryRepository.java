package com.dycle.maxcursos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dycle.maxcursos.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
