package Lesson1.HW1;

public class Treadmill implements Obstacles{
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }
    public void overcome(Act competitable){
        competitable.run(length);
    }
}
