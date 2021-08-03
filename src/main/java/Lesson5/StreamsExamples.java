package Lesson5;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static java.nio.charset.StandardCharsets.UTF_8;

public class StreamsExamples {
    public static void main(String[] args) {
        String tempString = "ё";
        System.out.println(Arrays.toString(tempString.getBytes()));
        System.out.println(Charset.defaultCharset());
        System.out.println((byte) 208);
        //System.out.println(Charset.availableCharsets());

        File file = new File("our_example.txt");
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            outputStream.write("кот".getBytes());
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (OutputStream outputStream1 = new FileOutputStream(file, true)) {//true - дозапись файла
            outputStream1.write(65);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        long time = System.currentTimeMillis();
//        try (OutputStream outputStream2 = new FileOutputStream("fimembs.txt") ){
//            for (int i = 0; i < 5 * 1024 * 1024; i++) {
//                outputStream2.write(65);
//            }
//
//        } catch (FileNotFoundException exception) {
//            exception.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("time of write:" + (System.currentTimeMillis() - time));

//        time = System.currentTimeMillis();
//        try (OutputStream outputStream2 = new BufferedOutputStream(new FileOutputStream("fimembs.txt"))){
//            for (int i = 0; i < 5 * 1024 * 1024; i++) {
//                outputStream2.write(65);
//                outputStream2.flush();
//            }
//
//        } catch (FileNotFoundException exception) {
//            exception.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("time of write:" + (System.currentTimeMillis() - time));

        try (InputStream inputStream = new FileInputStream("1.txt")) {
            for (int i = 0; i < new File("1.txt").length(); i++) {
                System.out.println(i + ":" + (char) inputStream.read());
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] bytes = null;

        try (InputStream inputStream = new FileInputStream("1.txt")){
            bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Create string charset "+new String(bytes, UTF_8));

    }
}
