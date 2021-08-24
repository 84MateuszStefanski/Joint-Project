package sda.exceptions.zadanie2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BookRepositoryTest {

    @Test
    void shouldCreateNewBook() {
        //given
        BookRepository repository = new BookRepository();
        //when
        Book book = repository.createNewBook("1234", "Lśnienie", "Stephen King", 1984);
        //then
        assertThat(book).isNotNull();
        assertThat(book.getIsbn()).isEqualTo("1234");
    }

    @Test
    void shouldAddBook() {
        //given
        BookRepository repository = new BookRepository();
        Book book = repository.createNewBook(
                "1234",
                "Lśnienie",
                "Stephen King",
                1984);
        //when
        repository.addBook(book);
        //then
        assertThat(repository.getBooks().size()).isEqualTo(1);
        assertThat(repository.getBooks().get(0).getAuthor()).isEqualTo("Stephen King");
    }

    @Test
    void shouldDeleteBook() {
        //given
        BookRepository repository = new BookRepository();
        repository.addBook(repository.createNewBook(
                "1234",
                "Lśnienie",
                "Stephen King",
                1984));
        repository.createNewBook(
                "1234",
                "Lśnienie",
                "Stephen King",
                1984);
        //when
        repository.getBooks().remove(repository.getBooks().get(0));
        //then
        assertThat(repository.getBooks()).isEmpty();
    }

    @Test
    void shouldThrowException() {
        //given
        BookRepository repository = new BookRepository();
        repository.addBook(repository.createNewBook(
                "1234",
                "Lśnienie",
                "Stephen King",
                1984));

        //then
        assertThrows(NoBookFoundException.class, () -> repository.deleteBook("1222"));
    }

    @Test
    void shouldSearchBookById() {
        //given
        BookRepository repository = new BookRepository();
        repository.addBook(repository.createNewBook(
                "1234",
                "Lśnienie",
                "Stephen King",
                1984));
        //when

        //then
        try {
            assertThat(repository.searchBookById("1234").getTitle()).isEqualTo("Lśnienie");
        } catch (NoBookFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    void shouldSearchBookByTitle() {
        //given
        BookRepository repository = new BookRepository();
        repository.addBook(repository.createNewBook(
                "1234",
                "Lśnienie",
                "Stephen King",
                1984));
        //when

        //then
        try {
            assertThat(repository.searchBookByTitle("Lśnienie").getIsbn()).isEqualTo("1234");
        } catch (NoBookFoundException e) {
            e.printStackTrace();
        }

    }
}