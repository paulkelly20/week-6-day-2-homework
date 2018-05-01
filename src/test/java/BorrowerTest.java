import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before() {
        borrower = new Borrower("Paul");
        library = new Library("CodeClan", 10);
        book = new Book ("Jaws", "Horror");
        library.addBook(book);
    }

    @Test
    public void borrowerHasName(){
        assertEquals("Paul", borrower.getName());
    }

    @Test
    public void borrowerHasEmptyCollectionOfBooks(){
        assertEquals(0, borrower.countBooks());
    }

    @Test
    public void borrowerGetsBookFromLibrary(){
        borrower.getBook(library);
        assertEquals(1, borrower.countBooks());
    }
}
