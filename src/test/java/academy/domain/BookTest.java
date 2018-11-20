package academy.domain;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BookTest {

    private Book book;
    private Book anotherCopy;

    @Before
    public void beforeEachTest(){
        book        = new Book("Author Name, A.", "12345X", "Do tests really pass?");
        anotherCopy = new Book("Author Name, A.", "12345X", "Do tests really pass?");
    }

    @Test
    public void toStringFormatsBookDetails() {
        assertThat(book.toString()).isEqualTo("'Do tests really pass?' (12345X) by Author Name, A.");
    }

    @Test
    public void twoAreEqual(){
        assertThat(anotherCopy).isEqualTo(book);
    }

    @Test
    public void twoEqualHaveSameHashCode(){
        assertThat(anotherCopy.hashCode()).isEqualTo(book.hashCode());
    }
}
