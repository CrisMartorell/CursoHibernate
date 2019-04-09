package com.openwebinars.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHello(Model model) {
		model.addAttribute("saludo", "Hola Mundo!");
		model.addAttribute("mensaje", "Me llena de orgullo y satisfacción saludaros desde este primer proyecto de Spring MVC");
		model.addAttribute("url", "http://www.openwebinars.net");
		
		return "hello";
	}
}
