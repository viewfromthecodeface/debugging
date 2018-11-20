package academy.domain;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

class Library {
    private List<Book> books;

    void add(Book book) {
        books.add(book);
    }

    List<Book> findAllByAuthor(String authorName) {
        return books.stream()
                .filter(book -> book.authorNameMatches(authorName))
                .collect(toList());
    }
}
