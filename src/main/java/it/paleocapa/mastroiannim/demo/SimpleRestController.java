package it.paleocapa.mastroiannim.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api")
@RestController
public class SimpleRestController  {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/book/{id}")
    public Book read(@PathVariable long id) {
        return bookRepository.findById(id).orElse(new Book());
    }

}
