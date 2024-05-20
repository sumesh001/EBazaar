package com.sky.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sky.entities.Orders;
import com.sky.entities.User;
import com.sky.repositories.OrderRepository;
@Component
public class OrderServices
{
	@Autowired
	private OrderRepository orderRepository;

	//get all orders
	public List<Orders> getOrders()
	{
		List<Orders> list=this.orderRepository.findAll();
		return list;
	}
	//save Order
	public void saveOrder(Orders order)
	{
		this.orderRepository.save(order);
	}
	
	//update order
	public void updateOrder(int id,Orders order)
	{
		order.setoId(id);
		this.orderRepository.save(order);
		 
	}
	
	//delete order
	public void deleteOrder(int id)
	{
		this.orderRepository.deleteById(id);
	}
	
	//get Order history of user
	public List<Orders> getOrdersForUser(User user)
	{
	 return  this.orderRepository.findOrdersByUser(user);
	}
	
}
