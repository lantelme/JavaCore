package Lesson2.HW2;

public class Main {
    public static void main(String[] args) {

        String[][] successArray = {{"1", "10", "12", "1"}, {"3", "2", "8", "3"}, {"1", "5", "8", "6"},
                {"23", "5", "7", "1"}};

        try {
            System.out.println(excludable(successArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

        String[][] invalidArray = {{"1", "10", "12", "friends"}, {"3", "2", "8", "3"}, {"1", "5", "8", "6"},
                {"23", "5", "7", "1"}};

        try {
            System.out.println(excludable(invalidArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int excludable(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Длина массива не равна 4-м элементам");
        }
        for (String[] arr : array) {
            if (arr.length != 4) {
                throw new MyArraySizeException("Высота массива не равна 4-м элементам");
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не число в массиве с элементами: [" + i + "," + j + "]");
                }
            }
        }
        return sum;
    }
}
