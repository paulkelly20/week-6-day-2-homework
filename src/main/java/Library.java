import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private String name;
    private int capacity;
    private ArrayList<Book> books;



    public  Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.books = new ArrayList<>();


    }

    public String getName(){
        return name;

    }

    public int countBooks() {
        return books.size();
    }

    public void addBook(Book book) {
        if(countBooks() < capacity)
        books.add(book);
    }

    public Book removeBook() {
        return books.remove(0);
    }
}
