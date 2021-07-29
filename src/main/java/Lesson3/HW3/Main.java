package Lesson3.HW3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] integersArray = {1, 5, 9, 7, 8};
        Double[] doublesArray = {4.8, 9.9, 1.6, 5.2};
        String[] stringsArray = {"Бублик", "Конфетки", "Сухарики", "Пончики"};

        elementChange(integersArray, 0, 2);
        elementChange(doublesArray, 1, 3);
        elementChange(stringsArray, 3, 1);

        System.out.println("Массив целых чисел: " + Arrays.toString(integersArray));
        System.out.println("Массив с плавающей точкой: " + Arrays.toString(doublesArray));
        System.out.println("Строковый массив: " + Arrays.toString(stringsArray));

        Box<Apple> boxWithApple = new Box<>(new Apple(1.0f), new Apple(1.0f));
        Box<Orange> boxWithOranges = new Box<>(new Orange(1.5f), new Orange(1.5f));
        Box<Fruit> boxWithFruits = new Box<>();

        System.out.println("Коробка с яблоками: " + boxWithApple.getWeight());
        System.out.println("Коробка с апельсинами: " + boxWithOranges.getWeight());
        System.out.println(boxWithApple.compare(boxWithOranges));

        boxWithOranges.transfer(boxWithFruits);
        System.out.println("Коробка с перемещенными фруктами: "+ boxWithFruits.getWeight());
    }

    private static void elementChange(Object[] array, int firstPosition, int secondPosition) {
        if (firstPosition < 0 || firstPosition > array.length ||
                secondPosition < 0 || secondPosition > array.length || firstPosition == secondPosition) ;
        Object a = array[firstPosition];
        array[firstPosition] = array[secondPosition];
        array[secondPosition] = a;

    }

}

