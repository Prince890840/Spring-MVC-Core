package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.pogo.Student;

@Controller
public class FormController {
	
	@RequestMapping("/showForm")
	public String show_form() {
		
		return "ComplexForm";
	}
	
	@RequestMapping(path = "/handler",method = RequestMethod.POST)
	public String handle_complexForm(@ModelAttribute("student") Student student,BindingResult result
			) {
		if(result.hasErrors()) {
			return "ComplexForm";
		}
		
		System.out.println("Student Obj :"+student);
		System.out.println("Add :" + student.getAddress());
		return "RegiSuccess";
	}
}
