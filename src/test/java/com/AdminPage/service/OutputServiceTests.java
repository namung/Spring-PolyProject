package com.AdminPage.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.AdminPage.controller.AdminController;
import com.AdminPage.model.Criteria;
import com.AdminPage.model.OutputCriteria;
import com.AdminPage.model.OutputVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")

public class OutputServiceTests {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	private OutputService outputService;
	
	/* 출고 목록 테스트 */	
	@Test
    public void GetOutputListTests() throws Exception {
		
       OutputCriteria cri = new OutputCriteria(1, 10);
        
       List<OutputVO> list = outputService.getOutputList(cri);
        
       for(int i=0; i<list.size(); ++i) {
    	   System.out.println("list " + i + "...." + list.get(i));
       }
        
	}
}
