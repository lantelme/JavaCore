
package Lesson3.Comparable;

        import org.jetbrains.annotations.NotNull;

        import java.lang.reflect.Array;
        import java.util.Arrays;

public class Box2 implements Comparable<Box2> {
    public int size;

    public Box2(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Box{" +
                "size=" + size +
                '}';
    }


    public static void main(String[] args) {
        Box box = new Box(5);
        Box box1 = new Box(10);
        System.out.println(box.compareTo(box1));

        Box[] boxes = {new Box(4), new Box(2), new Box(10), new Box(1)};
        Arrays.sort(boxes);

        System.out.println(Arrays.toString(boxes));
    }

    @Override
    public int compareTo(@NotNull Box2 o) {
        return size - o.size;
    }
}
