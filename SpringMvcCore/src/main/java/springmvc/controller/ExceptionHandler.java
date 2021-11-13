package springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandler {
	
	//For whole Project
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR) 
	//Exception Status send
	@org.springframework.web.bind.annotation.ExceptionHandler(value = NullPointerException.class)
	public String exceptionHandler(Model model) {
		model.addAttribute("msg1","Null Pointer Exception");
		return "null_page";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR) 
	//Exception Status send
	@org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
	public String genricException(Model model) {
		model.addAttribute("msg","Exception has Occured");
		return "null_page";
	}
	
	@ResponseStatus(value=HttpStatus.BAD_REQUEST) 
	//Exception Status send
	@org.springframework.web.bind.annotation.ExceptionHandler(value = NumberFormatException.class)
	public String exceptionHandler1(Model model) {
		model.addAttribute("msg1","Number Formate Exception");
		return "null_page";
	}
}
