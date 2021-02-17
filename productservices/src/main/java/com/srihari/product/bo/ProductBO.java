package com.srihari.product.bo;

import com.srihari.product.dto.Product;

public interface ProductBO {
	
	public void create(Product product);
	public Product findProduct(int id);

}
