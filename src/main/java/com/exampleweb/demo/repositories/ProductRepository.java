package com.exampleweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampleweb.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
