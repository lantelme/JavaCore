package Lesson4.HW4;

import java.util.*;

public class Phonebook {
    private HashMap<String, List<String>> phoneBook = new HashMap<>();

    public void add(String surname, String number) {
        List<String> phones = phoneBook.getOrDefault(surname, new ArrayList<>());
        phones.add(number);
        phoneBook.put(surname, phones);
    }

    public List<String> get(String surname) {
        if (phoneBook.containsKey(surname)) {
            return phoneBook.get(surname);
        } else {
            System.out.println("В справочнике нет записи для фамилии " + surname);
            return null;
        }
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "122333");
        phonebook.add("Petrov", "877428");
        phonebook.add("Gurbatov", "232244");
        phonebook.add("Ivanov", "233333");

        System.out.println("Номера телефонов: ");
        System.out.println(phonebook.get("Ivanov"));
        System.out.println(phonebook.get("Kuznetsov"));
    }

}
