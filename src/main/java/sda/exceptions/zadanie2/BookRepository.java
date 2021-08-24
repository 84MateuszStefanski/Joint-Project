package sda.exceptions.zadanie2;

import sda.exceptions.zadanie1.CannotDivideByIdException;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<Book> books = new ArrayList<>();


    public List<Book> getBooks() {
        return books;
    }

    public Book createNewBook(String isbn, String title, String author, int yearOfPublishment) {
        return new Book(isbn, title, author, yearOfPublishment);
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void deleteBook(String isbn) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                this.books.remove(book);
            }
            throw new NoBookFoundException("No book of that ID");
        }


    }

    public Book searchBookById(String isbn) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        throw new NoBookFoundException("No book of that ID");
    }

    public Book searchBookByTitle(String title) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        throw new NoBookFoundException("No book of that ID");
    }

}