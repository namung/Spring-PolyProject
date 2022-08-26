package com.AdminPage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdminPage.mapper.InputMapper;
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
}
