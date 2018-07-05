package home.andreybelonog.controllers;

import home.andreybelonog.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(BookController.URL)
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    static final String URL = "/api/book";


    @PostMapping()
    public String addNewBook(@RequestParam String title){
        return "Book has been created";
    }
}
