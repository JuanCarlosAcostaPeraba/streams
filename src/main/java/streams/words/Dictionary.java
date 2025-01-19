package streams.words;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    public static List<String> getWords() {
        String filePath = "src/main/resources/words.txt";

        try {
            return Files.readAllLines(Path.of(filePath));
        } catch (IOException e) {
            System.err.println("Error to read the file: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}