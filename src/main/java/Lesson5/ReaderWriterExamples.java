package Lesson5;

import java.io.*;
import java.util.ArrayList;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ReaderWriterExamples {

    public static void main(String[] args) throws FileNotFoundException {
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("1.txt"), UTF_8)) {
            int x;
            while ((x = inputStreamReader.read()) != -1) {
                System.out.print((char) x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("1.txt"))) {
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Student> studentArrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("student.txt"))) {
            String tempString;
            while ((tempString = bufferedReader.readLine()) != null) {
                String[] studentsParamArray = tempString.split(" ");
                studentArrayList.add(new Student(studentsParamArray[0], studentsParamArray[1],
                        Integer.parseInt(studentsParamArray[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(studentArrayList);

        try (PrintWriter printWriter = new PrintWriter("new_students.csv")) {
            for (Student student:studentArrayList){
                printWriter.write(student.toString());
            }

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }


    }
}
