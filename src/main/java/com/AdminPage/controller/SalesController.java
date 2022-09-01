package com.AdminPage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.AdminPage.model.OutputCriteria;
import com.AdminPage.model.SalesCriteria;
import com.AdminPage.service.ProductsService;
import com.AdminPage.service.SalesService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping(value="/admin")

public class SalesController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	private SalesService salesservice; 
	
	/* // 매출관리 데이터 전달
	// HttpServletRequest
	
	@RequestMapping(value="/sales/smain", method=RequestMethod.POST)
	public String monthTotalPOST(HttpServletRequest httpServletRequest, RedirectAttributes rttr) throws Exception {
		
		logger.info("sampleResult.jsp로 이동");
		
		String month = httpServletRequest.getParameter("send_month");
		logger.info(month);
		
		return "/admin/sales/sampleResult";
	}
	*/
	
	/* Model 객체 사용 */	
	
	@RequestMapping(value="/sales/smain", method=RequestMethod.POST)
	public String monthTotalPOST(@RequestParam("select_month") String selected_month, Model model, OutputCriteria oc) throws Exception {
		
		// 사용자가 선택한 월 데이터 전달
		logger.info("selected_month: " + selected_month);
		
		model.addAttribute("selected_month", selected_month); 
		oc.setMonth(selected_month);
		
		// 총액 구하는 method 실행
		int total = salesservice.monthTotal(oc);
		logger.info("total: " + total);
		
		// 총액 model 객체에 저장.
		model.addAttribute("total", total);
		
		// 상세보기 구하는 method 실행.
		List<OutputCriteria> list = salesservice.getMonthDetailList(oc);
		
		if(!list.isEmpty()) {
			// 상세보기 목록을 model 객체에 저장.
			logger.info("list: " + list);
			model.addAttribute("list", list);
			
		} else {
			logger.info("list: " + list);
			model.addAttribute("listcheck", "empty");
	
			return "/admin/sales/sSelectMontResult";
		}
		
		logger.info("sSelectMontResult.jsp로 이동");
		
		return "/admin/sales/sSelectMontResult";
	}
	
	@RequestMapping(value="/sales/sWeekReseult", method=RequestMethod.POST)
	public String WeekTotalPOST(@RequestParam("btn") String btn, Model model, OutputCriteria oc) throws Exception{
		
		// 사용자가 선택한 월 데이터 전달
		logger.info("check btn: " + btn);
		
		// 주 총액 처리
		int weekTotal = salesservice.weekTotal(oc);
		logger.info("week total: " + weekTotal);
		
		model.addAttribute("weekTotal", weekTotal);
		
		// 주 목록 처리
		List<OutputCriteria> list = salesservice.getMonthDetailList(oc);
		
		if(!list.isEmpty()) {
			
			// 목록을 model 객체에 저장.
			logger.info("list: " + list);
			model.addAttribute("list", list);
			
		} else {
			logger.info("list: " + list);
			model.addAttribute("listcheck", "empty");
	
			return "/admin/sales/sWeekResult";
		}
		
		logger.info("sWeekResult.jsp로 이동");
		
		return "/admin/sales/sWeekResult";
		
	}
	
}
