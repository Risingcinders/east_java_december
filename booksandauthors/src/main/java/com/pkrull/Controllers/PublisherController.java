package com.pkrull.Controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pkrull.Models.Author;
import com.pkrull.Models.Book;
import com.pkrull.Models.Publication;
import com.pkrull.Models.Publisher;
import com.pkrull.Services.AuthorService;
import com.pkrull.Services.BookService;
import com.pkrull.Services.PublisherService;

@Controller
public class PublisherController {
	public final PublisherService publisherService;
	private final BookService bookService;
	private final AuthorService authorService;

	
	public PublisherController(PublisherService publisherService, BookService bService, AuthorService aService) {
		this.publisherService = publisherService;
		this.bookService = bService;
		this.authorService = aService;
	}
	
	@PostMapping("/publishers")
	public String addPublisher(@Valid @ModelAttribute("publisher") Publisher publisher, BindingResult result, Model model, @ModelAttribute("author") Author author, @ModelAttribute("book") Book book, @ModelAttribute("publications") Publication publication) {
		if(result.hasErrors()) {
			model.addAttribute("authors", authorService.allAuthors());
			model.addAttribute("books", bookService.allBooks());
			model.addAttribute("publishers", publisherService.allPublishers());
			return "index.jsp";
		} else {
			publisherService.addPublisher(publisher);
			return "redirect:/authorandbooks";
		}
	}

}
