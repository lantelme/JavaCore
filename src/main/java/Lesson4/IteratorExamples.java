package Lesson4;

import java.util.*;

public class IteratorExamples {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 5));

        System.out.println(integers);

        for (Integer integer : integers) {
            if (integer == 3) {
                integers.remove(integer);
            }
        }
        System.out.println(integers);
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("test1",4);
        hashMap.put("test12",4);
        hashMap.put("test13",4);

        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            String data = iterator.next().getKey();
            System.out.println(data);
            if (data.equals("test12")){
                iterator.remove();
            }
        }
        System.out.println(hashMap);

       // HashMap<Integer, ArrayList<>>
    }
}
