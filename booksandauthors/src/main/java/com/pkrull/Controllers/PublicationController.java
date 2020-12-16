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
import com.pkrull.Services.PublicationService;
import com.pkrull.Services.PublisherService;

@Controller
public class PublicationController {
	private final PublicationService publicationService;
	private final AuthorService authorService;
	private final BookService bookService;
	private final PublisherService publisherService;
	
	public PublicationController(PublicationService publicationService,BookService bService, AuthorService aService, PublisherService pService) {
		this.publicationService = publicationService;
		this.authorService = aService;
		this.bookService = bService;
		this.publisherService = pService;
	}
	
	@PostMapping("/publications")
	public String createPublications(@Valid @ModelAttribute("publications") Publication publications, BindingResult result, Model model, @ModelAttribute("author") Author author, @ModelAttribute("book") Book book, @ModelAttribute("publisher") Publisher publisher) {
		if(result.hasErrors()) {
			model.addAttribute("authors", authorService.allAuthors());
			model.addAttribute("books", bookService.allBooks());
			model.addAttribute("publishers", publisherService.allPublishers());
			return "index.jsp";
		} else {
			publicationService.createPublication(publications);
			return "redirect:/authorandbooks";
		}
	}
}
