package com.srihari.product.bo;

import com.srihari.product.dao.ProductDAO;
import com.srihari.product.dto.Product;

public class ProductBOImpl implements ProductBO {
	
	ProductDAO dao;	

	@Override
	public void create(Product product) {
		dao.create(product);

	}

	@Override
	public Product findProduct(int id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}
	
	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

}
