package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.pogo.User;
import springmvc.userservice.UserService;

@Controller
public class Registration {
		
	  @Autowired 
	  private UserService userService;
	 
	/*userService Object Inject Spring Container
		so we have to Autowired it
	 */
	
	@ModelAttribute
	public void commonDataforModel(Model model) {
		model.addAttribute("des","Risk He To Isk He");
		model.addAttribute("Prince","Pankti");
	}

	@RequestMapping("Registration")
	public String showForm(Model model) {
		return "Registration";
	}
	
	/* @ModelAttribute :- 
	  		   1.Fetch Data from Form [request.getAttribute("fname");]
			   2.Set data into Object [user.setFname("Prince);"]
			   3.and Object set to Model Object
				[model.addAttribute("user",user);]

			-> Note : Pogo class property-name and feild-name  
						must be same and sequence
			*/
	
	@RequestMapping(path = "/processform" , method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model
			) {
		System.out.println(user);	
		
		int createUser = this.userService.createUser(user);
		model.addAttribute("msg","User Created with Id :"+createUser);
		
		return "RegiSuccess";
	} 
}
