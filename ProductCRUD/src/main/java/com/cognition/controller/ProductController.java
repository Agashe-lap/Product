package com.cognition.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognition.model.Product;
import com.cognition.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService ps;
	
	@GetMapping("/display")
	public List<Product> display(){
		return ps.display();
	}
	
	@PostMapping("/add")
	public Product add(@RequestBody Product product) {
		return ps.add(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		ps.delete(id);
	}
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable int id, @RequestBody Product p) {
		ps.update(p, id);
	}
	
}
