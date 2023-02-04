package com.examples.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "customers")
public class Customers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId; 
	private String customerName;
	private String customerPhone;
	@JsonManagedReference
	@OneToOne(mappedBy = "customers", fetch = FetchType.LAZY)
	private Address address;
	@JsonManagedReference
	@OneToMany(mappedBy = "customers", fetch = FetchType.LAZY)
	private List<Orders> orders = new ArrayList<>();
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	/*
	 * @Override public String toString() { return "Customers [customerId=" +
	 * customerId + ", customerName=" + customerName + ", customerPhone=" +
	 * customerPhone + ", address=" + address + "]"; }
	 */
	
	
	
	
	

}
