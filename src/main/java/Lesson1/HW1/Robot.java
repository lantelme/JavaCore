package Lesson1.HW1;

public class Robot implements Act {
    private int maxHeight;
    private int maxLength;

    public Robot(int maxHeight, int maxLength) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }

    @Override
    public void jump(int height) {
        if (height >= maxHeight) {
            System.out.println("I'm robot, i can't jump");
        } else {
            System.out.println("I'm robot, i can jump");
        }
    }

    @Override
    public void run(int length) {
        if (length >= maxLength) {
            System.out.println("I'm robot, i can't run");
        } else {
            System.out.println("I'm robot, i can run");
        }
    }
}