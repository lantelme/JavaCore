package Lesson1.HW1;

public class Wall implements Obstacles{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void overcome(Act competitable){
        competitable.jump(height);
    }
}
