package sda.interfaces.zadanie2;

public class Movie {
    private String title;
    private String director;
    private int yearOfRelease;
    private String movieGenre;
    private String publisher;

    public Movie(String title, String director, int yearOfRelease, String movieGenre, String publisher) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.movieGenre = movieGenre;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", movieGenre='" + movieGenre + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    static class MovieCreator{
        private String title;
        private String director;
        private int yearOfRelease;
        private String movieGenre;
        private String publisher;

        public MovieCreator setTitle(String title) {
            this.title = title;
            return this;
        }

        public MovieCreator setDirector(String director) {
            this.director = director;
            return this;
        }

        public MovieCreator setYearOfRelease(int yearOfRelease) {
            this.yearOfRelease = yearOfRelease;
            return this;
        }

        public MovieCreator setMovieGenre(String movieGenre) {
            this.movieGenre = movieGenre;
            return this;
        }

        public MovieCreator setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Movie createMovie(){
            return new Movie(title,director,yearOfRelease,movieGenre,publisher);
        }
    }
}
