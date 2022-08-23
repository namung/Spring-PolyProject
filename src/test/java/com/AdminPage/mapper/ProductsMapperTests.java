package com.AdminPage.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.AdminPage.model.Criteria;
import com.AdminPage.model.ProductsVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ProductsMapperTests {
	
	@Autowired
	private ProductsMapper mapper;
	
	/*상품 등록 테스트*/
	/*@Test
	public void productsEnroll() throws Exception{
		
		ProductsVO product = new ProductsVO();
		
		product.setProductId("호");
		product.setProductName("호두과자");
		product.setCategory("호두");
		product.setProductPrice(5000);
		product.setProductImg("c:/product");
		product.setEtc("비고사항");
		
		mapper.productsEnroll(product);
	}
	*/
	
	/*상품리스트, 상품 총 개수*/
	/*@Test
	public void productsGetListTest() {
		Criteria cri = new Criteria();*/
		/*검색 조건*/
		/*cri.setKeyword("가");
		
		/*검색 리스트*/
		/*List list = mapper.productsGetList(cri);
		for(int i = 0; i < list.size(); i++) {
			System.out.println("result............"+i+":"+list.get(i));
			
		}
		
		/*상품 총 갯수*/
		/*int result = mapper.productsGetTotal(cri);
		System.out.println("result.........." + result);
		
	}*/
	
	/*상품 조회 페이지*/
	/*@Test
	public void productsGetDetailTest() {
		String productId = "핫001";
		ProductsVO result = mapper.productsGetDetail(productId);
		System.out.println("상품 조회 데이터: " + result);
	}*/
	
	/*상품 정보 수정*/
	/*@Test
	public void productsModifyTest() {
		ProductsVO product = new ProductsVO();
		
		product.setProductId("1234");
		product.setProductName("수정테스트");
		product.setCategory("수정테스트");
		product.setProductPrice(20000);
		product.setProductStock(20);
		product.setProductImg("c:////www");
		product.setEtc("수정테스트");
		
		mapper.productsModify(product);
	}*/
	
	/*상품 정보 삭제*/
	/*@Test
	public void productsDeleteTest() {
		String productId = "1234";
		int result = mapper.productsDelete(productId);
		
		if(result == 1) {
			System.out.println("삭제 성공");
		}
	}*/
	
	/*현재 수량 업데이트*/
	@Test
	public void changeStockTest() {
		String productId = "감001";
		
		mapper.changeStock(productId);
	}
	
	
	
	
}
