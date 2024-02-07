package com.asma.BooksAPI.controllers;


import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asma.BooksAPI.models.Book;
import com.asma.BooksAPI.services.BookService;

@RestController
public class BooksAPI {
 private final BookService bookService;
 public BooksAPI(BookService bookService){
     this.bookService = bookService;
 }
 
 //findAll
 @RequestMapping(value="/api/books", method=RequestMethod.GET)
 public List<Book> getAll() {
	 List<Book> books = bookService.allBooks();
	 return books;
 }
 
 //find One book
 @RequestMapping(value="/api/books/{id}", method=RequestMethod.GET)
 public Book findOne(@PathVariable("id") Long id) {
	 Book book = bookService.findBook(id);
	 return book;
 }
 
 
 
 // other methods removed for brevity
 @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
 public Book update(
 		@PathVariable("id") Long id, 
 		@RequestParam(value="title") String title, 
 		@RequestParam(value="description") String desc, 
 		@RequestParam(value="language") String lang,
 		@RequestParam(value="pages") Integer numOfPages) {
     Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
     return book;
 }
 
 @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
 public void destroy(@PathVariable("id") Long id) {
	 System.out.println("Book of Id "+ id +" was successfully deleted");
     bookService.deleteBook(id);
 }
}
