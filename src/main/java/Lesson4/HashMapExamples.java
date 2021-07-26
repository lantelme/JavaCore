package Lesson4;

import java.util.HashMap;

public class HashMapExamples {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        //hashMap.put(1,"one");
        //  System.out.println(hashMap);
        // hashMap.put(1,"twortete");
        //  System.out.println(hashMap);

        HashMap<Integer, String> passports = new HashMap<>();
        passports.put(1234, "Irina");
        passports.put(43234, "Mark");
        passports.put(123324, "Peter");
        passports.put(112234, "Kira");
        System.out.println(passports);

        //passports.remove(1234);
        // System.out.println(passports);

        // System.out.println(passports.get(43234));

        System.out.println(passports);
        for (Integer passportNum : passports.keySet()) {
            if (passportNum == 123324)
                passports.remove(passportNum);
            // System.out.println(passports.get(passportNum));
        }
        System.out.println(passports);

//        for (String name: passports.values()){
//            System.out.println(name);
//        }


    }
}
