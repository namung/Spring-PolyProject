package com.AdminPage.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.AdminPage.mapper.SalesMapper;
import com.AdminPage.model.SalesCriteria;
import com.AdminPage.model.SalesVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class SalesMapperTests {

    @Autowired
    private SalesMapper salesmapper;	// SalesMapper.java 인터페이스의 의존성 주입.

//	// 판매물품 입력 쿼리 테스트 메서드
//	@Test
//	public void salesAdd() throws Exception{
//		SalesVO sales = new SalesVO();
//
//		sales.setProductId(10);
//		sales.setProductName("test");	    // 상품명
//		sales.setProductPrice(2000);	    // 상품 가격
//		sales.setSalesAmount(1);	        // 판매량
//		sales.setSalesDate("2022-05-05");	// 판매일
//
//		salesmapper.salesAdd(sales);          // 쿼리 메서드 실행
//	}

    // 월 총액 select 쿼리 테스트 메서드
    @Test
    public void monthTotal() throws Exception{
    	
        SalesCriteria sc = new SalesCriteria();

        // month data가 db로 잘 갔을 경우
//        sc.setMonth("3");
//		// month data가 db로 잘 가지 않았을 경우
		sc.setMonth("13");

        int data;
        data = salesmapper.monthTotal(sc);          // 쿼리 메서드 실행
        
        int total = sc.getProductPrice() * sc.getSalesAmount(); 
        
        System.out.println("==============================");
        System.out.println("결과값: " + total);
        System.out.println("sales mapper 작동 시 값: " + data);
        System.out.println("==============================");

    }
    
// // 월 선택에 따른 상세보기 쿼리 테스트 메서드
//    @Test
//    public void testGetMonthDetailList() throws Exception{
//    	
//    	SalesCriteria sc = new SalesCriteria();
//    	// month data가 db로 잘 갔을 경우
//        sc.setMonth("3");
////		// month data가 db로 잘 가지 않았을 경우
////		sc.setMonth("13");
//    	
//    	List<SalesCriteria> list = salesmapper.getMonthDetailList(sc);
//        
//    	for(int i=0; i < list.size(); ++i) {
//    		System.out.println("list의 " + i + " 번 째 값: " + list.get(i));
//    	}
//
//    }
    	

}
