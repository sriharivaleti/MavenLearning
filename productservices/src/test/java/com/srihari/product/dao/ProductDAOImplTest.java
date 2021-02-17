package com.srihari.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.srihari.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateAProdcut() {
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("Realme");
		product.setDescription("Its awesome");
		product.setPrice(16000);
		
		dao.create(product);
		
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("Realme", result.getName());
	}

}
