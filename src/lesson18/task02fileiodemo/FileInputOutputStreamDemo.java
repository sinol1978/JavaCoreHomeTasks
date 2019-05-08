package lesson18.task02fileiodemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        try (OutputStream output = new FileOutputStream("src/io/file.txt");
             InputStream input = new FileInputStream("src/io/file.txt")) {
            char[] symbols = {'a', 'b', 'c'};
            for (char i : symbols) {
                output.write(i);
            }
        } catch (IOException e) {
            System.out.println("Exception:\n" + e.getMessage());
        }
    }
}
