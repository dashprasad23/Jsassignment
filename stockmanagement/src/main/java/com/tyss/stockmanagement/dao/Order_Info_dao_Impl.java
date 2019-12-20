package com.tyss.stockmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.stockmanagement.dto.Order_Info;

@Repository
public class Order_Info_dao_Impl implements Order_Info_dao {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addOrder(Order_Info order) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(order);
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public boolean updateOrder(Order_Info order) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Order_Info o= manager.find(Order_Info.class,order.getId());
			o.setTotal_price(o.getTotal_price());
			o.setTotal_price_with_gst(o.getTotal_price_with_gst());
			
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public boolean deleteOrderById(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Order_Info order= manager.find(Order_Info.class, id);
			manager.remove(order);
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public List<Order_Info> getAllOrder() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Order_Info";
		TypedQuery<Order_Info> typedQuery = manager.createQuery(jpql, Order_Info.class);
		return typedQuery.getResultList();
	}

}
