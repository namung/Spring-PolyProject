package com.AdminPage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdminPage.mapper.InputMapper;
import com.AdminPage.model.Criteria;
import com.AdminPage.model.InputVO;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class InputServiceImpl implements InputService {
	
	@Autowired
	private InputMapper inputMapper;
	
	/*입고등록*/
	@Override
	public void productsInput(InputVO input) {
		log.info("(service)productsInput............");
		inputMapper.productsInput(input);
	}
	
	/*상품 목록*/
	@Override
	public List<InputVO> inputGetList(Criteria cri){
		log.info("inputGetList()...........");
		return inputMapper.inputGetList(cri);
	}
	
	/*상품 총 개수*/
	@Override
	public int inputGetTotal(Criteria cri) {
		log.info("inputGetTotal()...........");
		return inputMapper.inputGetTotal(cri);
	}
	
}
