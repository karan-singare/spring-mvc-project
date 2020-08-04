package com.karansingare.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Define a controller
 * Define Controller Method
 * Add Request Mapping to the controller method
 * return view name
 * create view*/


/*
 * @Controller this tells spring that it is a controller
 * @Controller extends @Component so it get picked up during component scanning*/

@Controller 
public class HomeController {
	@RequestMapping("/") 
	public String showPage() {  // Define Controller Method
		return "main-menu"; // Return the view name
		
	}
}
