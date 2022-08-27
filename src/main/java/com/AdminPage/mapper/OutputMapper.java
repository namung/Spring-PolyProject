package com.AdminPage.mapper;

import java.util.List;

import com.AdminPage.model.Criteria;
import com.AdminPage.model.OutputCriteria;
import com.AdminPage.model.OutputVO;

public interface OutputMapper {

	/* 출고 등록 */
	public void productsOutputEnroll(OutputVO output);
	
	/* 게시판 목록 */
    public List<OutputVO> getOutputList(OutputCriteria cri);
	
}
