package com.AdminPage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/admin/IO")
@Log4j
public class OutputController {
	/* 출고 관리 페이지 접속 */
    @RequestMapping(value = "/productsOutput", method = RequestMethod.GET)
    public void productsOutputGET() throws Exception{
        log.info("출고관리페이지 접속");
    }
    
}
