package academy.domain;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LibraryTest {
    private static final Book BOOK1 = new Book("Mellor, A.", "2072364X", "The despair of debugging");
    private static final Book BOOK2 = new Book("Mellon, A.", "2072346X", "Less tests, more debugging");
    private static final Book BOOK3 = new Book("Mellor, A.", "2072365X", "No really, just use TDD");
    private static final Book BOOK4 = new Book("Whalley, M.","6666666X", "Fix this or you're fired");

    private Library library;

    @Before
    public void beforeEachTest(){
        library = new Library();

        library.add(BOOK1);
        library.add(BOOK2);
        library.add(BOOK3);
        library.add(BOOK4);
    }

    @Test
    public void listsAllBooksByAuthor(){
        List<Book> results = library.findAllByAuthor("Mellor, A.");

        assertThat(results).containsExactlyInAnyOrder(BOOK1, BOOK3);
    }
}
