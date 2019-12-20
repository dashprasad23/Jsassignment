package com.tyss.stockmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.stockmanagement.dao.Order_Info_dao;
import com.tyss.stockmanagement.dto.Order_Info;

@Service
public class Order_Info_Service_Impl implements Order_Info_Service {
	@Autowired
	private Order_Info_dao odo;

	@Override
	public boolean addOrder(Order_Info order) {
		
		return odo.addOrder(order);
	}

	@Override
	public boolean updateOrder(Order_Info order) {
		
		return odo.updateOrder(order);
	}

	@Override
	public List<Order_Info> getAllOrder() {
		
		return odo.getAllOrder();
	}

}
