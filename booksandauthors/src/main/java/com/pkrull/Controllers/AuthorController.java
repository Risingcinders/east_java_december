package com.pkrull.Controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pkrull.Models.Author;
import com.pkrull.Models.Book;
import com.pkrull.Models.Publication;
import com.pkrull.Models.Publisher;
import com.pkrull.Services.AuthorService;
import com.pkrull.Services.BookService;
import com.pkrull.Services.PublisherService;

@Controller
public class AuthorController {
	private final AuthorService authorService;
	private final BookService bookService;
	private final PublisherService publisherService;
	
	public AuthorController(AuthorService aService, BookService bService, PublisherService pService) {
		this.authorService = aService;
		this.bookService = bService;
		this.publisherService = pService;
	}
	
	@RequestMapping("/authorandbooks")
	public String index(@ModelAttribute("author") Author author, @ModelAttribute("book") Book book, @ModelAttribute("publisher") Publisher publisher, @ModelAttribute("publications") Publication publication,  Model model) {
		model.addAttribute("authors", authorService.allAuthors());
		model.addAttribute("books", bookService.allBooks());
		model.addAttribute("publishers", publisherService.allPublishers());
		return "index.jsp";
	}
	
	@PostMapping("/authors")
	// or
	// @RequestMapping(value="/books", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("author") Author author, BindingResult result, Model model, @ModelAttribute("book") Book book, @ModelAttribute("publisher") Publisher publisher, @ModelAttribute("publications") Publication publication) {
		if (result.hasErrors()) {
			model.addAttribute("authors", authorService.allAuthors());
			model.addAttribute("books", bookService.allBooks());
			model.addAttribute("publishers", publisherService.allPublishers());
            return "index.jsp";
        } else {
            authorService.createAuthor(author);
            return "redirect:/";
        }
	}
	
	
}
