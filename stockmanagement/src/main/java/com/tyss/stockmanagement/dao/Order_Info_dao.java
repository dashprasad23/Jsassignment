package com.tyss.stockmanagement.dao;

import java.util.List;

import com.tyss.stockmanagement.dto.Order_Info;
public interface Order_Info_dao {
	public boolean addOrder(Order_Info order);
	public boolean updateOrder(Order_Info order);
	public boolean deleteOrderById(int id);
	public List<Order_Info> getAllOrder();

}
