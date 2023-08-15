package com.exampleweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampleweb.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
