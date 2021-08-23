package Lesson9.HW9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Irina", Arrays.asList(new Course("Math"), new Course("Physics"),
                new Course("IT"))));
        students.add(new Student("Michail", Arrays.asList(new Course("Math"), new Course("Biology"),
                new Course("Math"))));
        students.add(new Student("Ksenia", Arrays.asList(new Course("Physics"), new Course("Geography"),
                new Course("IT"), new Course("Biology"))));

        //возвращает список уникальных курсов
        System.out.println(students.stream()
                .map(s -> s.getCourses())
                .flatMap(f -> f.stream())
                .collect(Collectors.toSet()));
        System.out.println(" ");

        //любознательный студент
        System.out.println(students.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(2)
                .collect(Collectors.toList()));
        System.out.println(" ");

        //вывод студента, у которого есть указанный курс
        Course course = new Course("IT");
        System.out.println(students.stream()
                .filter(s -> s.getCourses().contains(course))
                .collect(Collectors.toList()));
    }
}