package home.andreybelonog.model.controller;

import home.andreybelonog.model.Book;
import home.andreybelonog.model.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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
    public String addBook(@RequestBody Book book) {
        bookService.addBook(book);

        return book.getTitle() + " has been successfully added to your storage, bro.";
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable("id") long id){
        bookService.deleteBook(id);

        return "Book has been removed";
    }

    @PutMapping()
    public String updateBook(@RequestBody Book book){
        bookService.updateBook(book);

        return "It doesn't work that way I expect yet";
    }

    @GetMapping
    public Iterable<Book> getAll() {
        return bookService.getAll();
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable("id") long id){
        return bookService.getById(id);
    }

    @GetMapping("/getAll" + "/{authorFullName}")
    public List<Book> findAllByAuthor(@PathVariable("authorFullName") String authorFullName){
        return bookService.findAllByAuthor(authorFullName);
    }

    @DeleteMapping()
    public String deleteAll(){
        bookService.deleteAll();

        return "Your entire collection has been deleted";
    }
}
