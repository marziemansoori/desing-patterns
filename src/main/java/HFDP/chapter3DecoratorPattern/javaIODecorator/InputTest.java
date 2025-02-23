package HFDP.chapter3DecoratorPattern.javaIODecorator;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputTest {

    public static void main(String[] args) {
        int c;

        File file = new File("test.txt");
        System.out.println("Absolute Path: " + file.getAbsolutePath());

        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("test.txt")));

            while ((c = in.read()) >= 0 ) {
                System.out.print((char) c);
            }

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
