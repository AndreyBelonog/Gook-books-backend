package home.andreybelonog.controllers;

import home.andreybelonog.domain.Book;
import home.andreybelonog.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping(BookController.URL)
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    static final String URL = "/api/book";


    @PostMapping()
    public String addNewBook(@RequestParam String title, Map<String, Object> model){
        Book book = new Book();
        book.setTitle(title);

        bookRepository.save(book);

        Iterable<Book> books = bookRepository.findAll();
        model.put("books", books);

        return String.format("%s book was added to collection", title);
    }

    @GetMapping
    public String getAll(Map<String, Object> model){
        Iterable<Book> books = bookRepository.findAll();

        model.put("books", books);

        return "getAll";
    }
}
