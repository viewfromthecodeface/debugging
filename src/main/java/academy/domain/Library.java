package academy.domain;

import java.util.List;

import static java.util.stream.Collectors.toList;

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
