package com.cognition.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognition.model.Product;
import com.cognition.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository pr;
	
	
	@Override
	public Product add(Product p) {
		// TODO Auto-generated method stub
		return pr.save(p);
	}

	@Override
	public List<Product> display() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		pr.deleteById(id);
	}

	@Override
	public void update(Product p, int id) {
		// TODO Auto-generated method stub
		p.setId(id);
		pr.save(p);
	}

}
