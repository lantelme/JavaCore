package Lesson1;

import static Lesson1.Utils.makeAnimalOlder;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "Белый", 1);

        System.out.println(cat1);

        Cat cat2 = new Cat("Морис", "black", 1);
        Cat cat3 = new Cat("Морис", "black", 1);

        System.out.println(cat2.equals(cat3));

        Wolf wolf = new Wolf("Trevor", "Gray", 6);

        Animal cat4 = new Cat("Морис", "black", 1);

        if (cat4 instanceof Wolf) {
            Wolf cat5 = (Wolf) cat4;
        } else {
            System.out.println("Не является волком!");
        }
        Animal cat6 = new Cat("Морис", "black", 1);
        cat6.voice();

        //создать набор бассейнов и заставить животных проплыть по ним и вывести время на заплыв

        Cat catCompetitor1 = new Cat("Морис", "black", 1);
        catCompetitor1.setSwimmingSpeed(10);
        Wolf wolfCompetitor1 = new Wolf("Trevor", "Gray", 6);
        wolfCompetitor1.setSwimmingSpeed(12);
        Turtle turtleCompetitor1 = new Turtle("Тортилла", "Зеленая", 4);
        turtleCompetitor1.setSwimmingSpeed(15);

        Pool[] pools = {new Pool(15), new Pool(20), new Pool(35)};

        for (Pool pool : pools) {
            pool.getTimeToOvercomePool(catCompetitor1);
            pool.getTimeToOvercomePool(wolfCompetitor1);
            pool.getTimeToOvercomePool(turtleCompetitor1);

        }

        makeAnimalOlder(cat3);
    }
}
