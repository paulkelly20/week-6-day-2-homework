import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LIbraryTest {
    Book book;
    Library library;

    @Before
    public void before(){
        book = new Book("Jaws", "Horror");
        library = new Library("CodeClan", 10);
    }

    @Test
    public void libraryHasName() {
        assertEquals("CodeClan", library.getName());
    }

    @Test
    public void checkBooksInLIbrary(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void addBookToLIbrary(){
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void addBookToLibraryCapacityFull(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(10, library.countBooks());
    }

    @Test
    public void removeBookFromLIbrary(){
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.countBooks());

    }
}
