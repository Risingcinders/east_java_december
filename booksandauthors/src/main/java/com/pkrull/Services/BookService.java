package com.pkrull.Services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.pkrull.Models.Book;
import com.pkrull.Repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
	public void addBook(@Valid Book book) {
		// TODO Auto-generated method stub
		bookRepository.save(book);
	}
}
