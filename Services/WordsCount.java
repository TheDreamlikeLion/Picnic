package Services;

public class WordsCount {
    public static int wordsCount(String str) {
        char[] strArray = str.toCharArray();
        int wordsCount = 0;
        for (char chr : strArray) {
            if (chr == ' ') {
                wordsCount++;
            }
        }
        wordsCount++;
        return wordsCount;
    }
}
