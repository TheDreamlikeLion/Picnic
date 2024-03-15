package Services;

import java.util.HashMap;

public class WordsStatistic {
    public static HashMap<String, Integer> countWords(String str) {
        HashMap<String, Integer> fullStatistic = new HashMap<>();
        String[] words = str.split(" ");
        for (String word : words) {
            if (fullStatistic.containsKey(word)) {
                fullStatistic.put(word, fullStatistic.get(word) + 1);
            } else {
                fullStatistic.put(word, 1);
            }
        }
        return fullStatistic;
    }
}
