import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public Library() {
    }

    public void add(Book book){
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public boolean checkForBook(Book book){
        for(Book b : books){
            if(b.equals(book)) return true;
        }
        return false;
    }
}
