package com.examples.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "orders")
public class Orders {

	@Id
	private Integer orderId;
	private Date orderDate;
	
	@JsonBackReference(value ="orders")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="customerId",referencedColumnName = "customerId")
	private Customers customers;
	
	@JsonManagedReference(value ="o-orders")
	@OneToMany(mappedBy = "orders", fetch = FetchType.LAZY)
	private List<OrderDetails> orderDetails = new ArrayList<>();
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Customers getCustomers() {
		return customers;
	}
	public void setCustomers(Customers customers) {
		this.customers = customers;
	}
	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}
//	@Override
//	public String toString() {
//		return "Orders [orderId=" + orderId + ", orderDate=" + orderDate + ", customers=" + customers
//				+ ", orderDetails=" + orderDetails + "]";
//	}
//	

}
