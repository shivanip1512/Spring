package springMVC.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/MVC")
public class HomeController {

	@RequestMapping(path = "/home",method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("name", "Shivani");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView = new ModelAndView();
		//set the data
		modelAndView.addObject("name","Shivani Pacharne");
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(1234);
		marks.add(5678);
		marks.add(4125);
		modelAndView.addObject("marks",marks);
		//set view name
		modelAndView.setViewName("help");
		return modelAndView;
	}

}
