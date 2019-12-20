package com.tyss.stockmanagement.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product_info")
public class Product_Info {

	@Id
	@GeneratedValue
	@Column(name="Product_Id")
	private int id;
	@Column
	private String name;
	@Column
	private String catagary;
	@Column
	private String company;
	@Column
	private int quantity;
	@Column
	private double price;
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
	public String getCatagary() {
		return catagary;
	}
	public void setCatagary(String catagary) {
		this.catagary = catagary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@ManyToMany(fetch = FetchType.LAZY,
			cascade = {
					CascadeType.PERSIST,
					CascadeType.MERGE
	})
	@JoinTable(name = "order_History",
	joinColumns = { @JoinColumn(name = "Product_Id") },
	inverseJoinColumns = { @JoinColumn(name = "Order_Id")})
	private Set<Order_Info> order_Info=new HashSet<>();






}
