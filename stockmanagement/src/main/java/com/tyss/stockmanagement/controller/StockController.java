package com.tyss.stockmanagement.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.stockmanagement.dto.Order_Info;
import com.tyss.stockmanagement.dto.Product_Info;
import com.tyss.stockmanagement.service.Order_Info_Service;
import com.tyss.stockmanagement.service.Product_Info_Service;


@RestController
public class StockController {
	@Autowired
	private Product_Info_Service service1;
	@Autowired
	private Order_Info_Service service2;
	@PostMapping(path="/addproduct",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public boolean addProduect(@RequestBody Product_Info bean1)
	{
		return service1.addProduct(bean1);
	}//end of add product
	
	@GetMapping(path="/getproduct", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Product_Info> getProduct()
	{
		return service1.getAllProduct();
	}
	@DeleteMapping(path="/deleteproduct/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean deleteProduct(@PathVariable("id")int id) {
		return service1.deleteProductById(id);
	}
	@GetMapping(path="/searchproduct/{pname}}",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public Product_Info searchProduct(@PathVariable("pname")String pname,HttpServletRequest req)
	{
		return service1.searchProductByName(pname);
	}
	@PutMapping(path="/updateproduct",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces =MediaType.APPLICATION_JSON_VALUE )
	public boolean updateProduct(@RequestBody Product_Info bean){

		return service1.updateProduct(bean);
	}

	
//------------------------------- Order record------------------------------------------------
	@PostMapping(path="/addorder",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public boolean addOrder(@RequestBody Order_Info bean2)
	{
	   return service2.addOrder(bean2);
	}//end of add order
		 
		  @GetMapping(path="/getorder", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Order_Info> getOrder()
	{
		return service2.getAllOrder();
	}
	@PutMapping(path="/updateorder",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces =MediaType.APPLICATION_JSON_VALUE )
	public boolean updateOrder(@RequestBody Order_Info bean){

		return service2.updateOrder(bean);
	}
	
	
	
	
	

		 
	
	

}
