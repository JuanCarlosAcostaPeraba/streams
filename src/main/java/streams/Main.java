package streams;

import streams.films.Movie;
import streams.films.Movies;
import streams.words.Dictionary;

import java.util.List;

import static streams.films.Exercises.getYearWithMostMovies;

// import static streams.words.Exercices.*;


public class Main {
    public static void main(String[] args) {
        /* Dictionary */
        List<String> words = Dictionary.getWords();
        // System.out.println(getWordsThatStartWithLetterA2M(words));
        // System.out.println(getWordsThatStartWithLetterN2Z(words));
        // System.out.println(groupByThreeFirstLetters(words));
        // System.out.println(getPalindromes(words));
        // System.out.println(countVowelsOfEachWord(words));
        // System.out.println(getWordsThatStartWithLetterAAndEndWithLetterZ(words));
        // System.out.println(getTheMostLargeWord(words));

        /* Films */
        List<Movie> movies = Movies.getMovies();
        // System.out.println(getNumberOfMoviesByDirector(movies));
        // System.out.println(getNumberOfGenresByDirector(movies));
        // System.out.println(getMoviesThatOnlyHaveDramaAndComedyGenres(movies));
        // System.out.println(groupByYearAndEnumerate(movies));
        // System.out.println(getYearWithMostMovies(movies));
    }
}
