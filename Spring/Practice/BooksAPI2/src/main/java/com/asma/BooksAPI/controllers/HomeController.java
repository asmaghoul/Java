package com.asma.BooksAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.asma.BooksAPI.models.Book;
import com.asma.BooksAPI.services.BookService;

@Controller
public class HomeController {

	@Autowired
	private BookService bookSer;
	@GetMapping("/books")
	public String index(Model model) {
		//Retrieve all the books from DB
		List <Book> allbooks= bookSer.allBooks();
		System.out.println(allbooks);
		model.addAttribute("allbooks",allbooks);
		return "index.jsp";
	}
	@GetMapping("/books/{id}")
	public String findOneBook(@PathVariable("id") Long id, Model model) {
		//find One book by Id
		Book book= bookSer.findBook(id);
		System.out.println(book);
		model.addAttribute("book",book);
		return "bookDetail.jsp";
	}

}
