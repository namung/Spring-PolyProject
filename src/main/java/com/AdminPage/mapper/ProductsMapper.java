package com.AdminPage.mapper;

import java.util.List;

import com.AdminPage.model.Criteria;
import com.AdminPage.model.ProductsVO;

public interface ProductsMapper {

	/*상품 등록*/
	public void productsEnroll(ProductsVO product);
	
	/*상품 리스트*/
	public List<ProductsVO> productsGetList(Criteria cri);
	
	/*상품 총 개수*/
	public int productsGetTotal(Criteria cri);
	
	/*상품 조회 페이지*/
	public ProductsVO productsGetDetail(String productId);
	
	/*상품 수정*/
	public int productsModify(ProductsVO vo); 
	
	/*상품 정보 삭제*/
	public int productsDelete(String productId);
}
