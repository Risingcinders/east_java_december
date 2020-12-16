package com.pkrull;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


// 1.) Session
// 2.) Post
// 3.) Redirect

@Controller
public class HomeController {
	
	@RequestMapping("")
	public String index(HttpSession session) {
		Integer count = (Integer)session.getAttribute("count");
		System.out.println("count before:" + count);
		
		// if count exist in session, if it does, it will skip to line 32
		try {
			if(count.equals(null)) {
				// set the count as 0
				System.out.println(session.getAttribute("count"));
			}
		} catch(NullPointerException e) {
			session.setAttribute("count", 0);
			count = (Integer)session.getAttribute("count");
		}

		System.out.println("count after: " + count);
		return "index.jsp";
	}
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String process(
			HttpSession session,
			@RequestParam(value="name") String name,
			@RequestParam(value="location") String location,
			@RequestParam(value="language") String language,
			@RequestParam(value="comment") String comment
			) {
		// set session with form data
		session.setAttribute("form_name", name);
		session.setAttribute("form_location", location);
		session.setAttribute("form_language", language);
		session.setAttribute("form_comment", comment);
		
		// get the count from session
		Integer count = (Integer)session.getAttribute("count");
		// add to count variable
		count ++;
		// or
//		count = count + 1;
		// set count back in session
		session.setAttribute("count", count);
		
		System.out.println("name is in process: " + name);
		return "redirect:/result";
	}
	
	@RequestMapping("/result")
	public String result(HttpSession session, Model model) {
		// get session
		String display_name = (String)session.getAttribute("form_name");
		String display_location = (String)session.getAttribute("form_location");
		String display_language = (String)session.getAttribute("form_language");
		String display_comment = (String)session.getAttribute("form_comment");
		
		Integer count = (Integer)session.getAttribute("count");
		
		System.out.println("name is in result: " + display_name);
		// add form data to the view model, to be displayed in the jsp file
		model.addAttribute("name", display_name);
		model.addAttribute("location", display_location);
		model.addAttribute("language", display_language);
		model.addAttribute("comment", display_comment);
		
		model.addAttribute("counter", count);
		return "result.jsp";
	}

}
