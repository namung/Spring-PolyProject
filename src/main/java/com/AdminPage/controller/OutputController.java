package com.AdminPage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.AdminPage.model.Criteria;
import com.AdminPage.model.OutputVO;
import com.AdminPage.model.PageDTO;
import com.AdminPage.service.OutputService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/admin/IO")
@Log4j
public class OutputController {
	
	@Autowired
	private OutputService outputService;
	
	/* 출고 관리 페이지 접속 */
    @RequestMapping(value = "/productsOutput", method = RequestMethod.GET)
    public void productsOutputGET() throws Exception{
        log.info("출고관리페이지 접속");
    }
    
    /*출고 등록*/
    @PostMapping("/productsOutput")
    public String productsOutputPOST(OutputVO output, RedirectAttributes rttr) {
    	log.info("productsOutputPOST......."+output);
    	outputService.productsOutput(output);
    	rttr.addFlashAttribute("output_result", output.getProductId());
    	return "redirect:/admin/IO/productsOutputList";
    	
    }
    
    /*출고내역 페이지 접속*/
    @RequestMapping(value="/productsOutputList", method=RequestMethod.GET)
    public void productsOutputListGET(Criteria cri, Model model) throws Exception{
    	log.info("출고내역페이지 접속");
    	
    	/*출고 목록 데이터*/
    	List list = outputService.outputGetList(cri);
    	
    	if(!list.isEmpty()) {
    		model.addAttribute("list", list);
    	}else {
    		model.addAttribute("listcheck","empty");
    		return;
    	}
    	
    	/* 페이지 인터페이스 데이터 */
		model.addAttribute("pageMaker", new PageDTO(cri, outputService.outputGetTotal(cri)));
    	
    }
    
}
