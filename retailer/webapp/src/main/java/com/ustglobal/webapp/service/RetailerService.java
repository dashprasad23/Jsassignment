package com.ustglobal.webapp.service;

import com.ustglobal.webapp.dto.ProductBean;
import com.ustglobal.webapp.dto.RetailerBean;

public interface RetailerService {

	public RetailerBean login (int id, String password);
	public int CreateProfile(RetailerBean bean);
	public boolean changePassword(int id , String password);
	public ProductBean searchProduct(int oid);
	public int amountPayable();
}
