package com.AdminPage.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.AdminPage.model.ProductsVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ProductsServiceTests {

	/*ProductService 의존성 주입*/
	@Autowired
	private ProductsService service;
	
	@Test
	public void productsEnrollTest() throws Exception{
		
		ProductsVO product = new ProductsVO();
		
		product.setProductId("호두001");
		product.setProductName("호두과자");
		product.setCategory("간식류");
		product.setProductPrice(2132);
		
		service.productsEnroll(product);
	}
}
