package com.AdminPage.service;

import java.util.List;

import com.AdminPage.model.Criteria;
import com.AdminPage.model.OutputCriteria;
import com.AdminPage.model.OutputVO;

public interface OutputService {

	/*출고 등록*/
	public void productsOutputEnroll(OutputVO output) throws Exception;
	
	/* 출고 목록 */
    public List<OutputVO> getOutputList(OutputCriteria cri);
    
    /*출고 총 개수*/
    public int outputGetTotal(OutputCriteria cri);
}
