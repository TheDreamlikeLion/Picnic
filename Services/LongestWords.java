package Services;

import java.util.ArrayList;

public class LongestWords {
    public static ArrayList<String> longestWords(String str) {
        String[] words = str.split(" ");
        int MaxWordLength = 0;
        for (String word : words) {
            if (word.length() > MaxWordLength) {
                MaxWordLength = word.length();
            }
        }
        ArrayList<String> longestWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() == MaxWordLength) {
                if (!longestWords.contains(word)) {
                    longestWords.add(word);
                }
            }

        }
        return longestWords;
    }
}