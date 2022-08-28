package com.AdminPage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdminPage.mapper.OutputMapper;
import com.AdminPage.model.Criteria;
import com.AdminPage.model.OutputVO;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class OutputServiceImpl implements OutputService{
	
	@Autowired
	private OutputMapper outputMapper;
	
	/*출고등록*/
	@Override
	public void productsOutput(OutputVO output) {
		log.info("(service)productsOutput...............");
		outputMapper.productsOutput(output);
	}
	
	/*출고목록*/
	@Override
	public List<OutputVO> outputGetList(Criteria cri){
		log.info("outputGetList()...........");
		return outputMapper.outputGetList(cri);
	}
	
	/*상품 총 개수*/
	@Override
	public int outputGetTotal(Criteria cri) {
		log.info("outputGetTotal()..................");
		return outputMapper.outputGetTotal(cri);
	}
	
}
