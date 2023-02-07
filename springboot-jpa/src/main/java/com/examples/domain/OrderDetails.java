package com.examples.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "order_details")
public class OrderDetails {

	@Id
	private Integer orderDetailsId;
	private Integer quantity;
	@JsonBackReference(value ="o-orders")
	@ManyToOne
	@JoinColumn(name = "orderId", referencedColumnName = "orderId")
	private Orders orders;
	@JsonBackReference(value="products")
	@ManyToOne
	@JoinColumn(name = "productId", referencedColumnName = "productId")
	private Products products;

	public Integer getOrderDetailsId() {
		return orderDetailsId;
	}

	public void setOrderDetailsId(Integer orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderDetailsId=" + orderDetailsId + ", quantity=" + quantity + "]";
	}

}
