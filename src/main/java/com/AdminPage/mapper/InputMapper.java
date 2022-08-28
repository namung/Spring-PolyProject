package com.AdminPage.mapper;

import java.util.List;

import com.AdminPage.model.Criteria;
import com.AdminPage.model.InputVO;

public interface InputMapper {
	
	/*입고 등록*/
	public void productsInput(InputVO input);

	/*입고 목록*/
	public List<InputVO> inputGetList(Criteria cri);
	
	/*입고목록 총 개수*/
	public int inputGetTotal(Criteria cri);
	
	
}
