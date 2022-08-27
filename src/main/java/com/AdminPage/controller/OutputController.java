package com.AdminPage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.AdminPage.model.OutputVO;
import com.AdminPage.service.OutputService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/admin/IO")

public class OutputController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	private OutputService outputService;
	
	/*출고 등록*/
	@PostMapping("/productsOutput.do")
	public String productsOutputEnrollPOST(OutputVO output, RedirectAttributes rttr) throws Exception{
		
		logger.info("productsOutputPOST......" + output);
		
		outputService.productsOutputEnroll(output);
		
		rttr.addFlashAttribute("outputEnroll_result", output.getProductId());
		
		return "redirect:/admin/IO/productsOutputList";
	}
		

}
