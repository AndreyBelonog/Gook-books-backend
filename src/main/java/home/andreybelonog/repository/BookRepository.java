package home.andreybelonog.repository;

import home.andreybelonog.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
