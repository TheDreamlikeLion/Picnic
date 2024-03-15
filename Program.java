import static Services.LongestWords.longestWords;
import static Services.PrintList.printListWordsCounts;
import static Services.ShortestWords.shortestWords;
import static Services.WordsCount.wordsCount;
import static Services.WordsStatistic.countWords;

public class Program {

    static String fileName = "input.txt";

    public static void run() {
        FileHandler reader = new FileHandler(fileName);
        String data = reader.readData().trim().replaceAll(" +", " ");
        System.out.println("Статистика слов в файле " + fileName + ":");
        System.out.println("\tКоличество слов - " + (wordsCount(data)));
        System.out.println("\tСамые длинные слова: \n\t\t" + longestWords(data) + "\n");
        System.out.println("\tСамые короткие слова: \n\t\t" + shortestWords(data) + "\n");
        int topLimit = 5;
        System.out.println("\tТоп " + topLimit + " самых часто упоминаемых продуктов: ");
        printListWordsCounts(countWords(data), topLimit);
    }
}
