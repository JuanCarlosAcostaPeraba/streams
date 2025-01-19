package streams;

import streams.words.Dictionary;

import java.util.List;

import static streams.words.Exercices.*;


public class Main {
    public static void main(String[] args) {
        List<String> words = Dictionary.getWords();

        /* Dictionary */
        System.out.println(getWordsThatStartWithLetterA2M(words));
        System.out.println(getWordsThatStartWithLetterN2Z(words));
        System.out.println(groupByThreeFirstLetters(words));
        System.out.println(getPalindromes(words));
        System.out.println(countVowelsOfEachWord(words));
        System.out.println(getWordsThatStartWithLetterAAndEndWithLetterZ(words));
        System.out.println(getTheMostLargeWord(words));
    }
}
