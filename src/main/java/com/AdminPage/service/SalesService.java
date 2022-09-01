package com.AdminPage.service;

import java.util.List;

import com.AdminPage.model.OutputCriteria;

public interface SalesService {
	
//	// sales table 데이터 추가
//    public void salesAdd(SalesVO sales);
    
    /* 총액 data 전달 */
    public int monthTotal(OutputCriteria oc) throws Exception;
    
    /* 상세보기 data 전달 */
    public List<OutputCriteria> getMonthDetailList(OutputCriteria oc) throws Exception;
    
    /* 주 총액*/
    public int weekTotal(OutputCriteria oc) throws Exception;
}
