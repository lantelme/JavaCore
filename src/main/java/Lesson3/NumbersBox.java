package Lesson3;

import java.util.Arrays;

public class NumbersBox<T extends Number> {
    private T[] array;

    public NumbersBox(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "NumbersBox{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public double calcAverage() {
        double sum = 0.0;
        for (T num : array) {
            sum = sum + num.doubleValue();
        }
        return sum / array.length;
    }

    public boolean isSameAvg(NumbersBox<?> boxToCompare) {//<? super Double>
        return Math.abs(calcAverage() - boxToCompare.calcAverage()) < 0.001;//убрать погрешность получив абсолютные значения
    }

    public static <U extends Number> U getFirstElement(NumbersBox<U> numbersBox){
        return numbersBox.getArray()[0];
    }

    public static void main(String[] args) {
        NumbersBox<Integer> integerNumbersBox1 = new NumbersBox<>(1, 3, 4, 5, 6, 6, 4, 7, 7);
        System.out.println(integerNumbersBox1.calcAverage());

        NumbersBox<Integer> integerNumbersBox2 = new NumbersBox<>(1, 2, 35, 4);

        NumbersBox<Double> doubleNumbersBox = new NumbersBox<>(1.0, 4.0, 2.6, 8.9);
        System.out.println(integerNumbersBox1.isSameAvg(integerNumbersBox2));

        NumbersBox<Double> doubleNumbersBox1 = new NumbersBox<>(1.0, 4.0, 2.6, 8.9);

        doubleNumbersBox1.isSameAvg(doubleNumbersBox);

        System.out.println(getFirstElement(doubleNumbersBox));


    }

//1.24.14 часа посмотрела лекции
}
