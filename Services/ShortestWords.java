package Services;

import java.util.ArrayList;

public class ShortestWords {
    public static ArrayList<String> shortestWords(String str) {
        String[] words = str.split(" ");
        int MinWordLength = 10;
        for (String word : words) {
            if (word.length() <= MinWordLength) {
                MinWordLength = word.length();
            }
        }
        ArrayList<String> shortestWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() == MinWordLength) {
                if (!shortestWords.contains(word)) {
                    shortestWords.add(word);
                }
            }

        }
        return shortestWords;
    }
}