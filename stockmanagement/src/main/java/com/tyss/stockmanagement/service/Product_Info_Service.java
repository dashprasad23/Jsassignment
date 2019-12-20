package com.tyss.stockmanagement.service;

import java.util.List;

import com.tyss.stockmanagement.dto.Product_Info;

public interface Product_Info_Service {
	public boolean addProduct(Product_Info product);
	public boolean updateProduct(Product_Info product);
	public boolean deleteProductById(int id);
	public Product_Info searchProductByName(String pname);
	public List<Product_Info> getAllProduct();

}
