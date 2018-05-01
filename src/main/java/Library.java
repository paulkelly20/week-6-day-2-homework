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

    public int collectBooksbyGenre(){

        ArrayList<String> emptyArray = new ArrayList<>();

        for (Book book : this.books){ emptyArray.add(book.getGenre());}

        for (String book: emptyArray){genres.put(book, Collections.frequency(emptyArray, book) );}

        return genres.get("Horror");


    }



}



//    public int getTotal() {
//        int total = 0;
//
//        for (int number : this.numbers) {
//            total += number;
//        }
//
//        return total;