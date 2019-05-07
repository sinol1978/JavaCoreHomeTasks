package lesson18.task03copyfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopier {
    public static void main(String[] args) {
        System.out.println(copyFile("a.txt", "a1.txt"));
    }

    private static boolean copyFile(String path1, String path2) {
        try (InputStream input = new FileInputStream(path1);
             OutputStream output = new FileOutputStream(path2)) {
            for (byte i : input.readAllBytes()) {
                output.write(i);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Exception:\n" + e.getMessage());
            return false;
        }
    }
}
