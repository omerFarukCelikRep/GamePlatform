package Entities.concretes;

import java.time.LocalDate;
import java.util.List;

import Entities.abstracts.Entity;

public class Order implements Entity {
	private int id;
	private int customerId;
	private LocalDate orderDate;
	private List<Product> products;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public double getTotalPrice() {
		double total = 0;
		for (Product product : products) {
			total += product.getUnitPriceAfterDiscount();
		}
		return total;
	}
}
