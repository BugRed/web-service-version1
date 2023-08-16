package com.exampleweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampleweb.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
