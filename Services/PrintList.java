package Services;

import java.util.HashMap;
import java.util.Map;

public class PrintList {
    public static void printListWordsCounts(HashMap<String, Integer> source, int topLimit) {
        source.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(topLimit)
                .forEach(System.out::println);
    }
}
