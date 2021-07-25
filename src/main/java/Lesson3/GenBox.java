package Lesson3;

import java.util.ArrayList;

public class GenBox<T> {
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public GenBox(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "GenBox{" +
                "object=" + object +
                '}';
    }

//    public static T test(){
//        return T;
//    } - ограничение

//    public void test1(){
//     //   T test = new T();
//        T[] array = new T[10];
//    }  } - ограничение


    public static void main(String[] args) {
        GenBox<Integer> integerGenBox1 = new GenBox<>(5);
        GenBox<Integer> integerGenBox2 = new GenBox<>(10);

        System.out.println("Класс генбокса с целом числом " + integerGenBox1.getClass());
//        Integer[] arr = new Integer[];
//        if (arr instanceof Integer[]) {
//

        System.out.println(integerGenBox1.getObject() + integerGenBox2.getObject());

        GenBox<String> stringGenBox1 = new GenBox<>("Test1");
//        stringGenBox1.setObject(4);

        GenBox genBox = new GenBox(5);

        Integer a =new Integer(5);
        Number b = a;

        ArrayList<Integer> integerArrayList = new ArrayList<>();//наследование не работает
        ArrayList<Number> numberArrayList = new ArrayList<>();






    }

}
