package Lesson4.Garage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> garage = new ArrayList<>();

        Bike bike = new Bike("ява", 20);
        Car car = new Car("renault",100);

        garage.add(bike);
        garage.add(car);

        System.out.println(garage.indexOf(car));

        Car car1 =new Car("BMW", 98);
        garage.add(car1);

        Collections.sort(garage);

        System.out.println(garage);
        ArrayList<Car> carArrayList = new ArrayList<>(Arrays.asList(new Car("renault",100,12),
                new Car("bmw",150,15), new Car("lada",80,8)));

        Collections.sort(carArrayList, new CarComparatorByValue());
        System.out.println(carArrayList);

        Collections.reverse(carArrayList);
        System.out.println(carArrayList);

    }
}
