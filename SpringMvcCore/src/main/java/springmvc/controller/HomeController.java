package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping(path = "/home",method = RequestMethod.GET)
	public String home(Model model) {
		
		//Sending data from Controller to view usinf Model
		
		model.addAttribute("name","Prince");
		
		System.out.println("This is Home Url..");
		
		List<String> friendslist = new ArrayList<String>();
		friendslist.add("Pankti");
		friendslist.add("Ami");
		friendslist.add("QUEENS");
		
		model.addAttribute("friendslist",friendslist);
		
		return "index";
	}
	
	//ModelAndView
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		ModelAndView modelAndView = new ModelAndView();
		
		//Setting the Data
		
		modelAndView.addObject("name","Harekrishna");
		modelAndView.addObject("roll", 1);
		
		//Set Page
		
		modelAndView.setViewName("help");
		
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		
		modelAndView.addObject("marks",list);
		
		return modelAndView;
	}
	
}
