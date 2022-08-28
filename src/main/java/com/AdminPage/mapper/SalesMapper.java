package com.AdminPage.mapper;

import java.util.List;

import com.AdminPage.model.Criteria;
import com.AdminPage.model.OutputCriteria;

public interface SalesMapper {
		
	/* month 데이터 전달 */
	//public int monthEnroll(SalesCriteria sc);
	
    /* 매출 데이터 추가 */
    //public void salesAdd(SalesVO sales);
    
    /* 월 총액 */
    public int monthTotal(OutputCriteria oc);

    /* 월에 따른 상세보기 목록 */
    public List<OutputCriteria> getMonthDetailList(OutputCriteria oc);
    
    /* outputlist 목록 총 개수*/
	public int outputGetTotal(Criteria cri);
}
