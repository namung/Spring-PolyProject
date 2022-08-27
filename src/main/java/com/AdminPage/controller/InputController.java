package com.AdminPage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.AdminPage.model.Criteria;
import com.AdminPage.model.InputVO;
import com.AdminPage.service.InputService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/admin/IO")
@Log4j
public class InputController {
	
	@Autowired
	private InputService inputService;
	
	/*입고 등록*/
	@PostMapping("/productsInput")
	public String productsInputPOST(InputVO input, RedirectAttributes rttr) {
		
		log.info("productsInputPOST........"+input);
        
		inputService.productsInput(input);
		
		rttr.addFlashAttribute("input_result", input.getProductId());
		
		return "redirect:/admin/IO/productsInputList";
	}
	
	
}
