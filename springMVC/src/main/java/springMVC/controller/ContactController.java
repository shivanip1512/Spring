package springMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springMVC.model.User;
import springMVC.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	private void setHeader(Model m) {
		m.addAttribute("header_","Learn Spring MVC");
		m.addAttribute("desc","Home for Programmer");
	}

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String processForm(
			@RequestParam(name = "email",required = false) String userEmail,
			@RequestParam("userName") String userName,
			@RequestParam("userPassword") String userPassword,
			Model model
			) 
	{
		model.addAttribute("name",userName);
		model.addAttribute("email",userEmail);
		model.addAttribute("pwd",userPassword);
		return "userDetails";
	}
	
	@RequestMapping(path = "/processFormUsingMA",method = RequestMethod.POST)
	public String handleForm(
			@ModelAttribute User user,
			Model model
			) {
		if(user.getUserName().isEmpty() || user.getUserPassword().isEmpty() || user.getEmail().isEmpty()) {
			return "redirect:/contact";
		}
		this.userService.createUser(user);
		return "userDetails";
		}
}
