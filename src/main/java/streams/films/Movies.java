package streams.films;

import java.util.List;

public class Movies {
    private static final List<Movie> movies = List.of(
            new Movie(1, "The Shawshank Redemption", 1994, "tt0111161", List.of(new Movie.Genre(1, "Drama"), new Movie.Genre(2, "Crime")), List.of(new Movie.Director(1, "Frank Darabont", "nm0001104"))),
            new Movie(2, "The Godfather", 1972, "tt0068646", List.of(new Movie.Genre(1, "Drama"), new Movie.Genre(2, "Crime")), List.of(new Movie.Director(2, "Francis Ford Coppola", "nm0000338"))),
            new Movie(3, "The Dark Knight", 2008, "tt0468569", List.of(new Movie.Genre(1, "Action"), new Movie.Genre(2, "Crime"), new Movie.Genre(3, "Drama")), List.of(new Movie.Director(3, "Christopher Nolan", "nm0634240"))),
            new Movie(4, "The Lord of the Rings: The Return of the King", 2003, "tt0167260", List.of(new Movie.Genre(1, "Adventure"), new Movie.Genre(2, "Drama"), new Movie.Genre(3, "Fantasy")), List.of(new Movie.Director(4, "Peter Jackson", "nm0001392"))),
            new Movie(5, "Pulp Fiction", 1994, "tt0110912", List.of(new Movie.Genre(1, "Crime"), new Movie.Genre(2, "Drama")), List.of(new Movie.Director(5, "Quentin Tarantino", "nm0000233"))),
            new Movie(6, "Schindler's List", 1993, "tt0108052", List.of(new Movie.Genre(1, "Biography"), new Movie.Genre(2, "Drama"), new Movie.Genre(3, "History")), List.of(new Movie.Director(6, "Steven Spielberg", "nm0000229"))),
            new Movie(7, "The Lord of the Rings: The Fellowship of the Ring", 2001, "tt0120737", List.of(new Movie.Genre(1, "Adventure"), new Movie.Genre(2, "Drama"), new Movie.Genre(3, "Fantasy")), List.of(new Movie.Director(4, "Peter Jackson", "nm0001392"))),
            new Movie(8, "Forrest Gump", 1994, "tt0109830", List.of(new Movie.Genre(1, "Drama"), new Movie.Genre(2, "Romance")), List.of(new Movie.Director(7, "Robert Zemeckis", "nm0000709"))),
            new Movie(9, "Inception", 2010, "tt1375666", List.of(new Movie.Genre(1, "Action"), new Movie.Genre(2, "Adventure"), new Movie.Genre(3, "Sci-Fi")), List.of(new Movie.Director(3, "Christopher Nolan", "nm0634240"))),
            new Movie(10, "The Lord of the Rings: The Two Towers", 2002, "tt0167261", List.of(new Movie.Genre(1, "Adventure"), new Movie.Genre(2, "Drama"), new Movie.Genre(3, "Fantasy")), List.of(new Movie.Director(4, "Peter Jackson", "nm0001392"))),
            new Movie(11, "The Matrix", 1999, "tt0133093", List.of(new Movie.Genre(1, "Action"), new Movie.Genre(2, "Sci-Fi")), List.of(new Movie.Director(8, "Lana Wachowski", "nm0905154"), new Movie.Director(9, "Lilly Wachowski", "nm0905152"))),
            new Movie(12, "The Lord of the Rings: The Fellowship of the Ring", 2001, "tt0120737", List.of(new Movie.Genre(1, "Adventure"), new Movie.Genre(2, "Drama"), new Movie.Genre(3, "Fantasy")), List.of(new Movie.Director(4, "Peter Jackson", "nm0001392"))),
            new Movie(13, "The Big Lebowski", 1998, "tt0118715", List.of(new Movie.Genre(1, "Comedy"), new Movie.Genre(2, "Crime"), new Movie.Genre(3, "Drama")), List.of(new Movie.Director(10, "Joel Coen", "nm0001054"), new Movie.Director(11, "Ethan Coen", "nm0001053"))),
            new Movie(14, "The Silence of the Lambs", 1991, "tt0102926", List.of(new Movie.Genre(1, "Crime"), new Movie.Genre(2, "Drama"), new Movie.Genre(3, "Thriller")), List.of(new Movie.Director(12, "Jonathan Demme", "nm0001129"))),
            new Movie(15, "The Green Mile", 1999, "tt0120689", List.of(new Movie.Genre(1, "Crime"), new Movie.Genre(2, "Drama"), new Movie.Genre(3, "Fantasy")), List.of(new Movie.Director(1, "Frank Darabont", "nm0001104"))),
            new Movie(16, "The Truman Show", 1998, "tt0120382", List.of(new Movie.Genre(1, "Comedy"), new Movie.Genre(2, "Drama")), List.of(new Movie.Director(13, "Peter Weir", "nm0001837")))
    );

    public static List<Movie> getMovies() {
        return movies;
    }
}