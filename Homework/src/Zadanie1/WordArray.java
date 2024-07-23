package Zadanie1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordArray {

    public static void main(String[] args) {
        String[] words = {
                "Бигль", "Корги", "Шпиц", "Бигль", "Долматинец",
                "Такса", "Хаски", "Бигль", "Мальтипу", "Пудель",
                "Бульдог", "Бигль", "Алабай", "Доберман", "Бигль",
                "Шпиц", "Бигль", "Чихуа-хуа", "Такса", "Бигль"
        };

        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }

        System.out.println("Уникальные слова: " + uniqueWords);

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Количество повторений каждого слова: " + wordCount);
    }
}