package com.AdminPage.service;

import java.util.List;

import com.AdminPage.model.Criteria;
import com.AdminPage.model.InputVO;

public interface InputService {
	
	/*입고 등록*/
	public void productsInput(InputVO input);
	
	/*입고 목록*/
	public List<InputVO> inputGetList(Criteria cri);
	
	/*상품 총 개수*/
	public int inputGetTotal(Criteria cri);
	
}
