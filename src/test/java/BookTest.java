import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before(){
        book = new Book("Jaws", "Horror");
    }

    @Test
    public void bookHasName(){
        assertEquals("Jaws", book.getName());
    }

    @Test
    public void BookHasGenre(){
        assertEquals("Horror", book.getGenre());
    }
}
