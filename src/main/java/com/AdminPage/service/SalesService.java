package com.AdminPage.service;

import java.util.List;

import com.AdminPage.model.SalesCriteria;
//import com.AdminPage.model.SalesVO;

public interface SalesService {
	
//	// sales table 데이터 추가
//    public void salesAdd(SalesVO sales);
    
    // 총액 data 전달
//    public SalesCriteria monthTotal(SalesCriteria sc) throws Exception;
    public int monthTotal(SalesCriteria sc) throws Exception;
    
    
    // 상세보기 data 전달
    public List<SalesCriteria> getMonthDetailList(SalesCriteria sc) throws Exception;

}
