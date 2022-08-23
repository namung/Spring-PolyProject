package com.AdminPage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.AdminPage.mapper.SalesMapper;
import com.AdminPage.model.SalesCriteria;
import com.AdminPage.model.SalesVO;

@Service
public class SalesServiceImpl implements SalesService{

    @Autowired
    SalesMapper salesmapper;
    
//    // sales 테이블에 데이터 추가
//    @Override
//    public void salesAdd(SalesVO sales) throws Exception {
//
//    }
    
    // 월 총액
    @Override
    public SalesCriteria monthTotal(SalesCriteria sc1) throws Exception{

        return salesmapper.monthTotal(sc1);
    }
    
    // 상세보기
    @Override
    public List<SalesCriteria> getMonthDetailList(SalesCriteria sc2) throws Exception{
    	
    	return salesmapper.getMonthDetailList(sc2);
    }

}
