package sda.interfaces.zadanie2;

public class Main {

    public static void main(String[] args) {

        Movie movie = new Movie.MovieCreator()
                .setTitle("Nowy film")
                .setDirector("Alonzo Italjano")
                .setMovieGenre("Parodia")
                .setPublisher("ACME")
                .setYearOfRelease(2021)
                .createMovie();
        System.out.println(movie);
    }
}
