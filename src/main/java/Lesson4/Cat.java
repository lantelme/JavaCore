package Lesson4;


import java.util.*;

public class Cat implements Comparable<Cat> {
    private String name;
    private int age;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Cat(String name, int age, int weight) {
        this.weight = weight;
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("test", 12);
        Cat cat2 = new Cat("test", 11);
        Cat cat3 = new Cat("test2", 13,12);
        Cat cat4 = new Cat("test2", 14,100);

        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println(cat3.hashCode());

        HashSet<Cat> catHashSet = new HashSet<>(Arrays.asList(cat1, cat2, cat3,cat4));
        System.out.println(catHashSet);

        HashSet<Integer> integerHashSet = new HashSet<>(Arrays.asList(1,3,5,6,3,3,4));
        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<>(Arrays.asList(1,3,5,6,3,3,4));

        System.out.println(integerHashSet);
        System.out.println(integerLinkedHashSet);

        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(1,3,5,6,3,3,4));//сортировка
        System.out.println(treeSet);

        TreeSet<Cat> catTreeSet = new TreeSet<>(Arrays.asList(cat1, cat2, cat3,cat4));
        System.out.println(catTreeSet);

        TreeSet<Cat> catTreeSet1 = new TreeSet<>(new CatComparatorByWeight());
        catTreeSet1.add(cat1);
        catTreeSet1.add(cat2);
        catTreeSet1.add(cat3);
        catTreeSet1.add(cat4);
        System.out.println(catTreeSet1);

    }


    @Override
    public int compareTo(Cat o) {
        return o.age - age;
    }
}
