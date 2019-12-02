package com.ustglobal.webapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.webapp.dto.ProductBean;
import com.ustglobal.webapp.dto.RetailerBean;

@Repository
public class RetailerDAOImpl implements RetailerDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public RetailerBean login(int id, String password) {

		String jpql = "select r from RetailerBean r where id=:id and password=:pass";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<RetailerBean> query = manager.createQuery(jpql, RetailerBean.class);
		query.setParameter("id", id);
		query.setParameter("pass", password);

		try {
			RetailerBean bean = query.getSingleResult();
			return bean;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}


	@Override
	public int CreateProfile(RetailerBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		try {

			manager.persist(bean);
			transaction.commit();
			return bean.getRid();

		} catch (Exception e) {

			e.printStackTrace();
			return -1;
		}


	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction  = manager.getTransaction();
		transaction.begin();
		RetailerBean bean = manager.find(RetailerBean.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}


	@Override
	public ProductBean searchProduct(int oid) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(ProductBean.class, oid);
	}


	@Override
	public int amountPayable() {
		// TODO Auto-generated method stub
		return 0;
	}

}
