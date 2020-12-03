public class Book {
    private int ISBN, year;
    private String title;

    public Book(int ISBN, int year, String title) {
        this.ISBN = ISBN;
        this.year = year;
        this.title = title;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", year=" + year +
                ", title='" + title + '\'' +
                '}';
    }

    public boolean equals(Book book){
        return (this.ISBN == book.getISBN());
    }
}
