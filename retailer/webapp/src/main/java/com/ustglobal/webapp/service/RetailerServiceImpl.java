package com.ustglobal.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.webapp.dao.RetailerDAO;
import com.ustglobal.webapp.dto.ProductBean;
import com.ustglobal.webapp.dto.RetailerBean;

@Service
public class RetailerServiceImpl implements RetailerService {

	@Autowired
	private RetailerDAO dao;
	
	@Override
	public RetailerBean login(int id, String password) {
		
		return dao.login(id, password);
	}

	@Override
	public int CreateProfile(RetailerBean bean) {
		
		return dao.CreateProfile(bean);
	}

	@Override
	public boolean changePassword(int id, String password) {
		
		return dao.changePassword(id, password);
	}

	@Override
	public ProductBean searchProduct(int oid) {
		
		return dao.searchProduct(oid);
	}

	@Override
	public int amountPayable() {
		
		return dao.amountPayable();
	}

}
