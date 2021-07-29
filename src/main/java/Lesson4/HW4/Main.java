package Lesson4.HW4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] arrayWords = {"Mountains", "Rain", "Moon", "Street", "Sun", "Mountains", "Chat", "Telephone", "Sun",
                "House", "Sun", "Weather", "Muffin", "Coffee", "Tea", "Moon"};

        System.out.println(Arrays.toString(arrayWords));

        HashMap<String, Integer> uniqueWords = new HashMap<>();

        for (int i = 0; i < arrayWords.length; i++) {
            if (uniqueWords.containsKey(arrayWords[i])) {
                uniqueWords.put(arrayWords[i], uniqueWords.get(arrayWords[i]) + 1);
            } else {
                uniqueWords.put(arrayWords[i], 1);
            }
        }
        System.out.println(uniqueWords);
    }
}
