package com.AdminPage.mapper;

import java.util.List;

import com.AdminPage.model.Criteria;
import com.AdminPage.model.OutputVO;

public interface OutputMapper {
	/*출고 등록*/
	public void productsOutput(OutputVO output);
	
	/*출고 목록*/
	public List<OutputVO> outputGetList(Criteria cri);
	
	/*출고 목록 총 개수*/
	public int outputGetTotal(Criteria cri);
}
