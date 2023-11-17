package it.paleocapa.mastroiannim.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController {
    @Value("${spring.application.name}")
    String appName;

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }
    @RequestMapping("/book/{id}")
    public String getBook(@PathVariable long id, Model model) {
        model.addAttribute("bookId", id);
        bookRepository.findById(id).ifPresentOrElse(
            book -> model.addAttribute("book", book),
            () -> model.addAttribute("book", new Book()));
        return "book";
    }

    @RequestMapping("/user/{id}")
    public String getBorrowByUser(@PathVariable long id, Model model) {        
        List<Book> books = bookRepository.findBorrowByUser(id);
        model.addAttribute("books", books);
        return "books";

    }

    @RequestMapping("/book/all")
    public String getAllBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }
}
