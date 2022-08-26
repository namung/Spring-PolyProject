package com.AdminPage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.AdminPage.model.Criteria;
import com.AdminPage.model.InputVO;
import com.AdminPage.model.PageDTO;
import com.AdminPage.service.InputService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/admin/IO")
@Log4j
public class InputController {
	
	@Autowired
	private InputService inputService;
	
    /* 입고 등록 페이지 접속 */
    @RequestMapping(value = "/productsInput", method = RequestMethod.GET)
    public void productsInputGET() throws Exception{
        log.info("입고등록페이지 접속");
    }
	
    /*입고 등록*/
	@PostMapping("/productsInput")
	public String productsInputPOST(InputVO input, RedirectAttributes rttr) {
		
		log.info("productsInputPOST........"+input);
        
		inputService.productsInput(input);
		
		rttr.addFlashAttribute("input_result", input.getProductId());
		
		return "redirect:/admin/IO/productsInputList";
	}
	
	/* 입고 내역 페이지 접속 */
    @RequestMapping(value = "/productsInputList", method = RequestMethod.GET)
    public void productsInputListGET(Criteria cri, Model model) throws Exception{
        log.info("입고내역페이지 접속");
        
        /*입고 목록 데이터*/
        List list = inputService.inputGetList(cri);
        
        if(!list.isEmpty()) {
        	model.addAttribute("list", list);
        }else {
        	model.addAttribute("listcheck","empty");
        	return;
        }
        
        /* 페이지 인터페이스 데이터 */
		model.addAttribute("pageMaker", new PageDTO(cri, inputService.inputGetTotal(cri)));
    }
	
	
}
