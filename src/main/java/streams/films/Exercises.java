package streams.films;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercises {
    /**
     * Get the number of movies by each director.
     *
     * @param movies List of movies.
     * @return Map with the director as key and the number of movies as value.
     */
    public static Map<String, Long> getNumberOfMoviesByDirector(List<Movie> movies) {
        return movies.stream()
                .flatMap(m -> m.directors().stream())
                .collect(Collectors.groupingBy(
                        Movie.Director::name,
                        Collectors.counting()
                ));
    }

    /**
     * Get the number of genres of the movies of each director.
     *
     * @param movies List of movies.
     * @return Map with the director as key and the number of genres as value.
     */
    public static Map<String, Long> getNumberOfGenresByDirector(List<Movie> movies) {
        return movies.stream()
                .flatMap(m -> m.directors().stream()
                        .flatMap(d -> m.genres().stream()
                                .map(g -> Map.entry(d.name(), g.name()))
                        )
                )
                .distinct()
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.counting()
                ));
    }

    /**
     * Get the list of movies that only have the genres "Drama" and "Comedy".
     *
     * @param movies List of movies.
     * @return List of movies that only have the genres "Drama" and "Comedy".
     */
    public static List<Movie> getMoviesThatOnlyHaveDramaAndComedyGenres(List<Movie> movies) {
        return movies.stream()
                .filter(m -> m.genres().size() == 2)
                .filter(m -> m.genres().stream()
                        .allMatch(g -> g.name().equals("Drama") || g.name().equals("Comedy"))
                )
                .collect(Collectors.toList());
    }

    /**
     * Group movies by year and enumerate them.
     *
     * @param movies List of movies.
     * @return Map with the year as key and a map with the id as key and the movie as value.
     */
    public static Map<Integer, Map<Integer, Movie>> groupByYearAndEnumerate(List<Movie> movies) {
        return movies.stream()
                .collect(Collectors.groupingBy(
                        Movie::year,
                        Collectors.toMap(
                                Movie::id,
                                m -> m
                        )
                ));
    }

    /**
     * Get the year with the most movies.
     *
     * @param movies List of movies.
     * @return Year with the most movies.
     */
    public static Integer getYearWithMostMovies(List<Movie> movies) {
        return movies.stream()
                .collect(Collectors.groupingBy(
                        Movie::year,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }
}
