package com.AdminPage.mapper;

import java.util.List;

import com.AdminPage.model.SalesCriteria;
import com.AdminPage.model.SalesVO;

public interface SalesMapper {
	
	//// db 데이터 받기
	//public List<SalesVO> getList();
	
	//// month 데이터 전달
	//public int monthEnroll(SalesCriteria sc);
	
    //// 매출 데이터 추가
    //public void salesAdd(SalesVO sales);

//    // 월 총액
//    public SalesCriteria monthTotal(SalesCriteria sc);
    
    // 월 총액
    public int monthTotal(SalesCriteria sc);


    // 월에 따른 상세보기 목록
    public List<SalesCriteria> getMonthDetailList(SalesCriteria sc);
}
