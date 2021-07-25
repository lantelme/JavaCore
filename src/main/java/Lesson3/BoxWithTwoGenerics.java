package Lesson3;

public class BoxWithTwoGenerics<T, S> {
    private T obj1;
    public S obj2;

    public BoxWithTwoGenerics(T obj1, S obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public S getObj2() {
        return obj2;
    }

    public void setObj2(S obj2) {
        this.obj2 = obj2;
    }

    public static void main(String[] args) {
        BoxWithTwoGenerics<Integer, String> integerStringBoxWithTwoGenerics =
                new BoxWithTwoGenerics<>(1234, "ddd");
        System.out.println(integerStringBoxWithTwoGenerics.getObj1() + " " + integerStringBoxWithTwoGenerics.obj2);


    }


}


