package com.AdminPage.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.AdminPage.model.Criteria;
import com.AdminPage.model.PageDTO;
import com.AdminPage.model.ProductsVO;
import com.AdminPage.service.InputService;
import com.AdminPage.service.ProductsService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

	@Autowired
	private ProductsService productsService; 
	
	/* 관리자 매출관리 페이지 이동 */
    @RequestMapping(value="/sales/smain", method = RequestMethod.GET)
    public void adminSaleGET() throws Exception{
        
        logger.info("관리자 매출관리 페이지 이동");
        
    }
	/* 관리자 재고관리 페이지 이동 */
    @RequestMapping(value="/products/promain", method = RequestMethod.GET)
    public void adminProductsGET() throws Exception{
        
        logger.info("관리자 재고관리 페이지 이동");
        
    }
    
    /* 상품 등록 페이지 접속 */
    @RequestMapping(value = "/products/productsEnroll", method = RequestMethod.GET)
    public void productsListGET() throws Exception{
        logger.info("상품등록페이지 접속");
    }
    
    /* 상품 관리(등록/삭제/수정 페이지) 접속 */
    @RequestMapping(value = "/products/productsManage", method = RequestMethod.GET)
    public void productsManageGET(Criteria cri, Model model) throws Exception{
        logger.info("상품 관리 페이지 접속");
        /*상품 리스트 데이터*/
        List list = productsService.productsGetList(cri);
        
        if(!list.isEmpty()) {
        	model.addAttribute("list", list);
        }else {
        	model.addAttribute("listcheck", "empty");
        	return;
        }
        /*페이지 인터페이스 데이터*/
        model.addAttribute("pageMaker", new PageDTO(cri, productsService.productsGetTotal(cri)));
    }
    
    /*상품 등록 */
    @PostMapping("/products/productsEnroll")
    public String productsEnrollPOST(ProductsVO products, RedirectAttributes rttr) throws Exception{
    	
    	logger.info("productsEnrollPOST......"+ products);
    	
    	productsService.productsEnroll(products);
    	
    	rttr.addFlashAttribute("enroll_result", products.getProductName());
    	
    	return "redirect:/admin/products/productsManage";
    }
    
    /*상품 조회 페이지*/
    @GetMapping({"/products/productsDetail", "/products/productsModify"})
    public void productsGetInfoGET(String productId, Criteria cri, Model model) {
    	logger.info("productsGetInfo()....." + productId);
    	
    	/*목록 페이지 조건 정보*/
    	model.addAttribute("cri", cri);
    	
    	/*조회 페이지 정보*/
    	model.addAttribute("productsInfo", productsService.productsGetDetail(productId));
    }
    
    /*상품 정보 수정*/
    @PostMapping("/products/productsModify")
    public String productsModifyPOST(ProductsVO vo, RedirectAttributes rttr) {
    	logger.info("productsModifyPOST......."+ vo);
    	int result = productsService.productsModify(vo);
    	rttr.addFlashAttribute("modify_result", result);
    	return "redirect:/admin/products/productsManage";
    }
    
    /*상품 정보 삭제*/
    @PostMapping("/products/productsDelete")
    public String productsDeletePOST(String productId, RedirectAttributes rttr) {
    	logger.info("productsDeletePOST..........");
    	int result = productsService.productsDelete(productId);
    	rttr.addFlashAttribute("delete_result", result);
    	return "redirect:/admin/products/productsManage";
    }
    
    
    
    
    
	/* 관리자 메뉴관리 페이지 이동 */
    @RequestMapping(value="/menu/mmain", method = RequestMethod.GET)
    public void adminMenuGET() throws Exception{
        
        logger.info("관리자 메뉴관리 페이지 이동");
        
    }
}
