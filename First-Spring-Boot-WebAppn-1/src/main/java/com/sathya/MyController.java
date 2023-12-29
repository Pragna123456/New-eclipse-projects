package com.sathya;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	
	
	@RequestMapping("/url1")
	@ResponseBody
	public String index()
	{
		
		return "<h1> welcome to spring boot web appn </h1>";
		
		}

}
