package springmvc.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("This is One Handler");
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https:www.google.com");
		
		return redirectView;
		
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("This is Second Handler");
		return "help";
		
	    //2nd way 	
		//return "redirect:/two";
	}
}

