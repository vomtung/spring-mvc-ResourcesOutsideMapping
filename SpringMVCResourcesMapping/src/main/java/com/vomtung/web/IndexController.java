package com.vomtung.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/index")
public class IndexController {
	
	@RequestMapping(method=RequestMethod.GET)
	String index(){
		return "index";
	}
}
