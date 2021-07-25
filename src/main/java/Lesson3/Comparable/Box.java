package Lesson3.Comparable;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Box implements Comparable {
    public int size;

    public Box(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Box{" +
                "size=" + size +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        //this    otherBox; 0 - this == otherBox; negative - this < otherBox; positive - this > otherBox;
        return size - ((Box) o).size;//поменять местами сортировку
    }

    public static void main(String[] args) {
        Box box = new Box(5);
        Box box1 = new Box(10);
        System.out.println(box.compareTo(box1));

        Box[] boxes = {new Box(4), new Box(2), new Box(10), new Box(1)};
        Arrays.sort(boxes);

        System.out.println(Arrays.toString(boxes));
    }
}
