package com.srihari.product.dao;

import com.srihari.product.dto.Product;

public interface ProductDAO {
	
	void create(Product product);
	Product read(int id);
	void update(Product product);
	void delete();

}
