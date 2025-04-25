package com.cognition.service;

import java.util.List;

import com.cognition.model.Product;

public interface ProductService {

	public Product add(Product p);
	public List<Product> display();
	public void delete(int id);
	public void update(Product p,int id);
}
