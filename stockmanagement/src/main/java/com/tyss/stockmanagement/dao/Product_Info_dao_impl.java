package com.tyss.stockmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.stockmanagement.dto.Product_Info;

@Repository
public class Product_Info_dao_impl implements Product_Info_dao {
	@PersistenceUnit
	private EntityManagerFactory factory;
	

	@Override
	public boolean addProduct(Product_Info product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public boolean updateProduct(Product_Info product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Product_Info p = manager.find(Product_Info.class, product.getId());
			p.setCatagary(p.getCatagary());
			p.setCompany(p.getCompany());
			p.setName(p.getName());
			p.setPrice(p.getPrice());
			p.setQuantity(p.getQuantity());
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public boolean deleteProductById(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Product_Info product = manager.find(Product_Info.class, id);
			manager.remove(product);
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Product_Info searchProductByName(String pname) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from Product_Info where name=:name";
			TypedQuery<Product_Info> typedQuery = manager.createQuery(jpql,Product_Info.class);
			typedQuery.setParameter("name", pname);
			Product_Info product = typedQuery.getSingleResult();
			return product;
		}catch (Exception e) {
			return null;
		}
		
		
	}

	@Override
	public List<Product_Info> getAllProduct() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product_Info";
		TypedQuery<Product_Info> typedQuery = manager.createQuery(jpql, Product_Info.class);
		return typedQuery.getResultList();
		
	}

}
