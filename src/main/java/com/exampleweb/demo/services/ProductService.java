package com.exampleweb.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampleweb.demo.entities.Product;
import com.exampleweb.demo.repositories.ProductRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	@Transactional
	public List<Product> findAll() {
		return repository.findAll();
	}

	@Transactional
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();

	}

	@Transactional
    public Product insert(Product obj) {
        return repository.save(obj);
    }

}
