package day18;

import java.util.HashMap;
import java.util.Map;

public class WorldCount {
    public static void main(String[] args) {
        String text = "Java is great Java is powerful Java is everywhere";
        String[] words = text.toLowerCase().split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        // 방법 1 : ≈ 사용 (권장)
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // 방법 2 : merge 사용 (Java 8+)
//        for (String word : words) {
//            wordCount.merge(word, 1, Integer::sum);
//        }

        System.out.println(wordCount);
    }
}
