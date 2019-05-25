package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	
	@Id
	private int id;
	private String itemName;
	private int qty;
	private double price; 
	
	public Product() {
		
		
	}

	

	public Product(int id, String itemName, int qty, double price) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.qty = qty;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", itemName=" + itemName + ", qty=" + qty + ", price=" + price + "]";
	}
	
	

}
