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

    static final String URL = "/api/books";


    @PostMapping()
    public String addNewBook(@RequestBody Book book){
        Book tempBook = new Book();
        tempBook.setTitle(book.getTitle());
        tempBook.setAuthorFullName(book.getAuthorFullName());
        tempBook.setDescription(book.getDescription());


        bookRepository.save(tempBook);

        return String.format("%s book was added to collection", book.getTitle());
    }

    @GetMapping
    public  Iterable<Book> getAll(){
        return bookRepository.findAll();
    }
}
