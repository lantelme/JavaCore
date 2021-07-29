package Lesson3.HW3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> items;

    public Box(T... items) {
        this.items = new ArrayList<T>(Arrays.asList(items));
    }

    public double getWeight() {
        if (items.size() == 0) return 0;
        double weight = 0;
        for (T item : items) weight += item.getWeight();
        return weight;
    }

    public boolean compare(Box<? extends Fruit> box) {
        return Math.abs(getWeight() - box.getWeight()) < 0.0001f;
    }

    public void transfer(Box<? super T> box) {
        box.items.addAll(this.items);
        System.out.println("Фрукты перемещены в коробку");
    }
}



