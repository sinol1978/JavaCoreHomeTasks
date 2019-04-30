package lesson18.task05recursion;

import java.io.File;

public class FilesMain {
    public static void main(String[] args) {
        printFiles("c:\\Program Files");
    }

    private static void printFiles(String catPath) {
        File catalog = new File(catPath);
        System.out.println(catalog.isDirectory() ? catalog.getName().toUpperCase() : catalog.getName().toLowerCase());
        String[] list = catalog.list();
        if (list != null) {
            for (String fileName : list) {
                printFiles(catPath + "/" + fileName);
            }
            System.out.println("***************************************************************");
        }
    }
}
