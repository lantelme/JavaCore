package Lesson5.HW5;

import java.io.*;
import java.util.ArrayList;

public class AppData {
    private String[] header;
    private Integer[][] data;

    public String[] getHeader() {
        return header;
    }

    public Integer[][] getData() {
        return data;
    }

    public void saveFile(String fileName) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            bufferedWriter.write(toString(header));
            for (Integer[] row : data) {
                bufferedWriter.write(toString(row));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private <T> String toString(T[] row) {
        String result = " ";
        for (int i = 0; i < row.length; i++) {
            result += row[i].toString();
            if (i != row.length - 1) {
                result += ";";
            }
        }
        return result;
    }

    public void loadFile(String fileName) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            header = bufferedReader.readLine().split(";");
            ArrayList<Integer[]> arrayData = new ArrayList<>();
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                arrayData.add(stringToInt(s));
            }
            data = arrayData.toArray(new Integer[][]{{}});
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Integer[] stringToInt(String s) {
        String[] strings = s.split(";");
        Integer[] integers = new Integer[strings.length];
        for (int i = 0; i < strings.length; i++) {
            integers[i] = Integer.parseInt(strings[i]);
        }
        return integers;
    }

}
