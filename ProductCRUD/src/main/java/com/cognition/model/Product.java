package com.cognition.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String companyName;
	private float cost;
	private float sell;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String name, String companyName, float cost, float sell) {
		super();
		this.name = name;
		this.companyName = companyName;
		this.cost = cost;
		this.sell = sell;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public float getSell() {
		return sell;
	}
	public void setSell(float sell) {
		this.sell = sell;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", companyName=" + companyName + ", cost=" + cost + ", sell="
				+ sell + "]";
	}
}
