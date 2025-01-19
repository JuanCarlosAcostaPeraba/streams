package streams.words;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercises {
    /**
     * Found the words that start with the letter "a" to the letter "m".
     *
     * @param words List of words.
     * @return List of words.
     */
    public static List<String> getWordsThatStartWithLetterA2M(List<String> words) {
        return words.stream()
                .filter(w -> w.matches("\\b[a-m][a-z]*\\b"))
                .toList();
    }

    /**
     * Found the words that start with the letter "n" to the end of the dictionary.
     *
     * @param words List of words.
     * @return List of words.
     */
    public static List<String> getWordsThatStartWithLetterN2Z(List<String> words) {
        return words.stream()
                .filter(w -> w.matches("\\b[n-z][a-z]*\\b"))
                .toList();
    }

    /**
     * Group the words of the dictionary by their three first letters.
     *
     * @param words List of words.
     * @return Map with the first three letters of the word as key and the list of words as value.
     */
    public static Map<String, List<String>> groupByThreeFirstLetters(List<String> words) {
        return words.stream()
                .filter(w -> w.length() >= 3)
                .collect(
                        Collectors.groupingBy(
                                w -> w.substring(0, 3),
                                Collectors.toList()
                        )
                );
    }

    /**
     * Found the palindromes in the dictionary. A palindrome is a word, number, phrase, or other sequence of characters
     * that reads the same forward and backward, such as "madam" or "racecar".
     *
     * @param words Words list.
     * @return List of palindromes.
     */
    public static List<String> getPalindromes(List<String> words) {
        return words.stream()
                .filter(w -> w.length() > 2)
                .filter(w -> w.equals(new StringBuilder(w).reverse().toString()))
                .toList();
    }

    /**
     * Count the vowels used in the words.
     *
     * @param words List of words.
     * @return Map with the words and the number of vowels used in each word.
     */
    public static Map<String, Integer> countVowelsOfEachWord(List<String> words) {
        return words.stream()
                .collect(
                        Collectors.toMap(
                                w -> w,
                                w -> (int) w.chars().filter(c -> "aeiou".indexOf(c) >= 0).count()
                        )
                );
    }

    /**
     * Foung the words that start with the letter "a" and end with the letter "z".
     *
     * @param words List of words.
     * @return List of words.
     */
    public static List<String> getWordsThatStartWithLetterAAndEndWithLetterZ(List<String> words) {
        return words.stream()
                .filter(w -> w.matches("\\b[aA][a-z]*[zZ]\\b"))
                .toList();
    }

    /**
     * Found the most large word in the dictionary.
     *
     * @param words List of words.
     * @return The most large word.
     */
    public static String getTheMostLargeWord(List<String> words) {
        return words.stream()
                .max((w1, w2) -> w1.length() - w2.length())
                .orElse("");
    }
}
