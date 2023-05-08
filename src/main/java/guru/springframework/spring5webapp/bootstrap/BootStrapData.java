package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.repositories.AuthorRepostitory;
import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Djordje on 08-May-23
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepostitory authorRepostitory;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepostitory authorRepostitory, BookRepository bookRepository) {
        this.authorRepostitory = authorRepostitory;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepostitory.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "212312312312");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepostitory.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
    }
}
