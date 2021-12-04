package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	@RequestMapping("/one")
	public String handlerOne() {
		System.out.println("user hitted /one ...");
		return "redirect:/enjoy";
	}
	
	@RequestMapping("/two")
	public RedirectView handlerTwo() {
		System.out.println("inside handler two...");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("enjoy");
		return redirectView;
	}
	
	@RequestMapping("/enjoy")
	public String handlerEnjoy() {
		System.out.println("inside enjoy handler...");
		return "about";
	}
}
