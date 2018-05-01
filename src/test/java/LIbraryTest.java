import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LIbraryTest {
   private Book book;
   private Book book2;
   private Book book3;
   private Book book4;
   private Library library;

    @Before
    public void before(){
        book = new Book("Jaws", "Horror");
        book2 = new Book("IT", "Horror");
        book3 = new Book("Harry Potter", "Young Adult");
        book4 = new Book("Game of Thrones", "Fantasy");
        library = new Library("CodeClan", 10);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
    }

    @Test
    public void libraryHasName() {
        assertEquals("CodeClan", library.getName());
    }

    @Test
    public void checkBooksInLIbrary(){
        assertEquals(9, library.countBooks());
    }

    @Test
    public void addBookToLIbrary(){
        library.addBook(book);
        assertEquals(10, library.countBooks());
    }

    @Test
    public void addBookToLibraryCapacityFull(){
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
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
        assertEquals(9, library.countBooks());

    }

    @Test
    public void countBooksInGenreList(){
        assertEquals(0,library.countBooksByGenre());
    }

    @Test
    public void countBooksInGenreListAfterAddingBookscheckHorror(){
        library.collectBooksbyGenre();
        assertEquals( 7 , library.collectBooksbyGenre());
    }
}
