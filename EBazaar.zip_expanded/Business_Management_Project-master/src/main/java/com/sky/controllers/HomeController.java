package com.sky.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sky.entities.Product;
import com.sky.loginCredentials.AdminLogin;
import com.sky.services.ProductServices;

@Controller
public class HomeController 
{
	@Autowired
	private ProductServices productServices;
	
	
	@GetMapping("/home")
	public String home()
	{
		return "Home";
	}

	@GetMapping("/products")
	public String products( Model model)
	{ 
		List<Product> allProducts = this.productServices.getAllProducts();
		model.addAttribute("products", allProducts);
		return "Products";
	}

	@GetMapping("/location")
	public String location()
	{
		return "Locate_us";
	}

	@GetMapping("/about")
	public String about()
	{
		return "About";
	}

	@GetMapping("/login")
	public String login(Model model)
	{
		model.addAttribute("adminLogin",new AdminLogin());
		return "Login";
	}
}
