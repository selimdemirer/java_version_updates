package tasks;

import java.util.Arrays;
import java.util.List;

public class CharStreamTask {

    public static void main(String[] args) {

        //Given a list of words, print the number of characters for each word.

        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");
        words.stream()
                .map(s -> s.length())
                .forEach(System.out::println);

        //





    }
}
