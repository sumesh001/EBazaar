package com.sky.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sky.entities.Orders;
import com.sky.entities.User;

public interface OrderRepository extends JpaRepository<Orders, Integer>
{
	List<Orders> findOrdersByUser(User user);
}
