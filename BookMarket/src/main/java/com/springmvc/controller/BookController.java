package com.springmvc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import com.springmvc.domain.Book;
import com.springmvc.service.BookService;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/books")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@GetMapping
	public String requestBookList(Model model) {
		List <Book> list = bookService.getAllBookList();
		model.addAttribute("bookList", list);
		
		return "books";
	}
	
	
	@GetMapping("/all")
	public ModelAndView requestAllBooks(Model model) {
		List <Book> list = bookService.getAllBookList();
		ModelAndView mav = new ModelAndView();
		mav.addObject("bookList", list);
		mav.setViewName("books");
		return mav;
	}
	
	@GetMapping("/{category}")
	public String requestBooksByCategory(@PathVariable("category") String bookCategory, Model model) {
		List <Book> booksByCategory = bookService.getBookListByCategory(bookCategory);
		model.addAttribute("bookList", booksByCategory);
		
		return "books";
	}
}
