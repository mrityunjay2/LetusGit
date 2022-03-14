package com.secure.App;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/hii")
	public String home() 
	{
		return "home.jsp";
	}

}
