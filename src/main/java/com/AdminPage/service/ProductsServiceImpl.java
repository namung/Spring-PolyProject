package com.AdminPage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdminPage.mapper.ProductsMapper;
import com.AdminPage.model.Criteria;
import com.AdminPage.model.ProductsVO;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class ProductsServiceImpl implements ProductsService {
	@Autowired
	private ProductsMapper productsMapper;
	
	@Override
	public void productsEnroll(ProductsVO product){
		
		log.info("(service)productEnroll.......");
		productsMapper.productsEnroll(product);
	}
	
	/*상품리스트*/
	@Override
	public List<ProductsVO> productsGetList(Criteria cri){
		log.info("productsGetTotalList().......");
		return productsMapper.productsGetList(cri);
	}
	
	/*상품 총 개수*/
	@Override
	public int productsGetTotal(Criteria cri) {
		log.info("productsGetTotal()......");
		return productsMapper.productsGetTotal(cri);
	}
	
	/*상품 조회 페이지*/
	@Override
	public ProductsVO productsGetDetail(String productId) {
		log.info("(service)productsGetDetail......." + productId);
		return productsMapper.productsGetDetail(productId);
	}
	
	/*상품 정보 수정*/
	@Override
	public int productsModify(ProductsVO vo) {
		log.info("productsinfo............");
		
		return productsMapper.productsModify(vo);
	}
	
	/*상품 정보 삭제*/
	@Override
	public int productsDelete(String productId) {
		log.info("productsDelete.......");
		return productsMapper.productsDelete(productId);
	}
}
