package lesson18.task03copyfile;

import java.io.*;

public class FileCopier {
    public static void main(String[] args) {
        System.out.println(copyFile("a.txt", "a1.txt"));
    }

    private static boolean copyFile(String path1, String path2) {
        try (BufferedReader br = new BufferedReader(new FileReader("a.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("a1.txt"))) {
            String str;
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine();
            }
            return true;
        } catch (Exception e) {
            System.out.println("Exception:\n" + e.getMessage());
            return false;
        }
    }
}
