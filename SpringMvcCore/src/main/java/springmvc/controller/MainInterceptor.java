package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainInterceptor {
	
	@RequestMapping("/Interceptor")
	public String showForm() {
		
		return "Interceptor";
	}
	
	public String handler(@RequestParam("firstname")String name,
			Model model) {
		
		System.out.println("Fname=>"+name);
		model.addAttribute("name",name);
		return "NewFile";
	}
	
}
