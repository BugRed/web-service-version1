package com.exampleweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampleweb.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
