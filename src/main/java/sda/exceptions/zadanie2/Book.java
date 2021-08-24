package sda.exceptions.zadanie2;

public class Book {

    private String isbn;
    private String title;
    private String author;
    private int yearOfPublishment;

    public Book() {
    }

    public Book(String isbn, String title, String author, int yearOfPublishment) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublishment = yearOfPublishment;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishment() {
        return yearOfPublishment;
    }

    public void setYearOfPublishment(int yearOfPublishment) {
        this.yearOfPublishment = yearOfPublishment;
    }
}
