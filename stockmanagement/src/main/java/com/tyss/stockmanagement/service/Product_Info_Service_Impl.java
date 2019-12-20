package com.tyss.stockmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.stockmanagement.dao.Product_Info_dao;
import com.tyss.stockmanagement.dto.Product_Info;
@Service
public class Product_Info_Service_Impl implements Product_Info_Service {
	@Autowired
	private Product_Info_dao pdo;
	

	@Override
	public boolean addProduct(Product_Info product) {
		
		return pdo.addProduct(product);
	}

	@Override
	public boolean updateProduct(Product_Info product) {
		
		return pdo.updateProduct(product);
	}

	@Override
	public boolean deleteProductById(int id) {
		
		return pdo.deleteProductById(id);
	}

	@Override
	public Product_Info searchProductByName(String pname) {
		
		return pdo.searchProductByName(pname);
	}

	@Override
	public List<Product_Info> getAllProduct() {
		
		return pdo.getAllProduct();
	}

}
