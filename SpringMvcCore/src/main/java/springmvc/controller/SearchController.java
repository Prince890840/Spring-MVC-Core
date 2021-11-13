package springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
		
		@RequestMapping("/user/{userId}/{userName}")
		public String getUserDetails(@PathVariable("userId") int userId,
				@PathVariable("userName") String userName
				) {
			Integer.parseInt(userName); //NumberFormate Exception			
			System.out.println("UserId =>"+userId);
			System.out.println("UserName =>"+userName);
			
			return "NewFile";
		}

		@RequestMapping("/homee")
		public String home() {
			System.out.println("GOING TO GRAND THAKRE..");
			
			//Processing Area
			String str = null;	//throws null pointer exception
			System.out.println(str.length());
			
			return "NewFile";
		}
		/*
		@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR) 
		//Exception Status send
		@ExceptionHandler(value = NullPointerException.class)
		public String exceptionHandler(Model model) {
			model.addAttribute("msg1","Null Pointer Exception");
			return "null_page";
		}
		
		@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR) 
		//Exception Status send
		@ExceptionHandler(value = Exception.class)
		public String genricException(Model model) {
			model.addAttribute("msg","Exception has Occured");
			return "null_page";
		}
		
		@ResponseStatus(value=HttpStatus.BAD_REQUEST) 
		//Exception Status send
		@ExceptionHandler(value = NumberFormatException.class)
		public String exceptionHandler1(Model model) {
			model.addAttribute("msg1","Number Formate Exception");
			return "null_page";
		}
		*/
		
		@RequestMapping("/search")
		public RedirectView search(@RequestParam("searchbox") String query) {
			
			String url = "https:www.google.com/search?q="+query;
			
			if(query.isEmpty()) {
				System.out.println("Please Enter in feild");
			}
			
			RedirectView redirectView = new RedirectView();
			redirectView.setUrl(url);
			
			return redirectView;
		}
		
}
