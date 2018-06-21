package com.spring.myapp.book.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import com.spring.myapp.book.service.BookService;
 
@Controller
public class BookController {
     
    @Autowired
    BookService bookService;
     
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
         
        model.addAttribute("books", bookService.getBookList());       
         
        return "/book/book";
    }
     
}