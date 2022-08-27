package com.AdminPage.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdminPage.controller.AdminController;
import com.AdminPage.mapper.OutputMapper;
import com.AdminPage.model.Criteria;
import com.AdminPage.model.OutputCriteria;
import com.AdminPage.model.OutputVO;

@Service

public class OutputServiceImpl implements OutputService{
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	private OutputMapper outputMapper;
	
	/*출고 등록*/
	@Override
	public void productsOutputEnroll(OutputVO output) throws Exception {
		
		logger.info("(service) productsOutputEnroll......");
		
		outputMapper.productsOutputEnroll(output);
	}
	
	/*출고 목록*/
	@Override
	public List<OutputVO> getOutputList(OutputCriteria cri) throws Exception {
        
		logger.info("(service) getOutputList()......" + cri);
		
        return outputMapper.getOutputList(cri);
    }
 


}
