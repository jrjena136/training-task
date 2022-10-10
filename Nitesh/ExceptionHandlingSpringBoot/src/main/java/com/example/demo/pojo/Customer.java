package com.example.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	private long cid;
	private String customerName;
	private long mno;
	private String email;
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getMno() {
		return mno;
	}
	public void setMno(long mno) {
		this.mno = mno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Customer(long cid, String customerName, long mno, String email) {
		super();
		this.cid = cid;
		this.customerName = customerName;
		this.mno = mno;
		this.email = email;
	}
	
	public Customer() {
		
	}
	

}
