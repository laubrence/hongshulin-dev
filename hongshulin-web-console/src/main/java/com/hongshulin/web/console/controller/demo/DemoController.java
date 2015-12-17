package com.hongshulin.web.console.controller.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/demo/")
public class DemoController {
	
	@RequestMapping("blank")
	public String test(HttpServletRequest request,Model model){
	    return "demo/blank";       
	}

}
