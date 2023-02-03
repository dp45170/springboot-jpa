package com.examples.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId; 
	private String customerName;
	private String customerPhone;
	@OneToOne(mappedBy = "customers")
	private Address address;
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
	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", customerName=" + customerName + ", customerPhone="
				+ customerPhone + ", address=" + address + "]";
	}
	
	
	
	
	

}
