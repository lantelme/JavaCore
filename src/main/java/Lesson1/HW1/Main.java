package Lesson1.HW1;

public class Main {
    public static void main(String[] args) {
    Act[] acts = {new Cat(2,4), new Robot(3,5),
            new People(2,7)};
    Obstacles[] obstacles = {new Wall(4), new Treadmill(3)};

    for (Act act:acts){
        for (Obstacles obstacles1:obstacles){
            obstacles1.overcome(act);
        }
    }


    }
}
