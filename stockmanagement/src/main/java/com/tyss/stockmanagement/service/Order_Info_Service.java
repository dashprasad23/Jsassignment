package com.tyss.stockmanagement.service;

import java.util.List;

import com.tyss.stockmanagement.dto.Order_Info;

public interface Order_Info_Service {
	public boolean addOrder(Order_Info order);
	public boolean updateOrder(Order_Info order);
	 public List<Order_Info> getAllOrder();

}
