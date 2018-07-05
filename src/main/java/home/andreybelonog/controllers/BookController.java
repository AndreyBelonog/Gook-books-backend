package home.andreybelonog.controllers;

import home.andreybelonog.domain.Book;
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
    public String addNewBook(@RequestBody String title){
        Book book = new Book();
        book.setTitle(title);

        bookRepository.save(book);

        return String.format("%s book was added to collection", title);
    }

    @GetMapping
    public  Iterable<Book> getAll(){
        return bookRepository.findAll();
    }
}
