package com.pkrull.Controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/demo")
public class HomeController {
	@RequestMapping("")
	public String index(HttpSession session, Model model) {
		String name = (String)session.getAttribute("name_for_template");
		model.addAttribute("name_for_jsp", name);
		return "index.jsp";
	}
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String process(RedirectAttributes redirectAttributes, HttpSession session, @RequestParam(value="full_name") String fName) {
		session.setAttribute("name_for_template", fName);
		System.out.println(fName);
		redirectAttributes.addFlashAttribute("success", "Submitted a form");
		return "redirect:/demo";
	}
	
	
	@RequestMapping("/name")
	public String name(@RequestParam(value="name", required = false) String name, @RequestParam(value="location", required = false) String loc) {
		return "Name: " + name + ", location:" + loc;
	}
	
	@RequestMapping("/location/{location}")
	public String location(@PathVariable("location") String loc) {
		if(loc.equals("tulsa")) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		return "Location: " + loc;
	}
	
	@RequestMapping("/show/{location}")
	public String show(Model model, @PathVariable("location")String loc) {
		String name = "Phil";
		model.addAttribute("userName", name);
		model.addAttribute("useLocation", loc);
		return "show.jsp";
	}
}
