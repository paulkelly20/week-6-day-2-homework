import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Library {
    private String name;
    private int capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> genres;



    public  Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.books = new ArrayList<>();
        this.genres = new HashMap<>();


    }

    public String getName(){
        return name;

    }

    public HashMap getGenres(){
        return genres;
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

    public int countBooksByGenre() {
        return genres.size();
    }

    public void collectBooksByGenre(){

        ArrayList<String> genreArray = new ArrayList<>();

        for (Book book : this.books)
            { genreArray.add(book.getGenre());}

        for (String book: genreArray)
            {genres.put(book, Collections.frequency(genreArray, book) );}




    }



}


