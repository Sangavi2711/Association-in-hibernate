package com.model;

import javax.persistence.Table;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@PrimaryKeyJoinColumn(name="ID")
	int empid;
	String name,email;
	public void setAddress(Address address) {
		this.address = address;
	}
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
	Address address;
	
	public Employee(int empid, String name, String email, Address address) {
		super();
		this.empid = empid;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
	public Employee() {
		super();
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	
	

}
