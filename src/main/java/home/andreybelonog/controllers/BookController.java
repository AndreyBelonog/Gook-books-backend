package home.andreybelonog.controllers;

import home.andreybelonog.model.entity.Book;
import home.andreybelonog.model.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(BookController.URL)
public class BookController {

    static final String URL = "/api/books";
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @PostMapping()
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable("id") long id){
        bookService.deleteBook(id);
    }

    @PutMapping()
    public void updateBook(@RequestBody Book book){
        bookService.updateBook(book);
    }

    @GetMapping
    public Iterable<Book> getAll() {
        return bookService.getAll();
    }
}
