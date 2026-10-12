package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public static void main(String[] args) throws IOException {
        File folder = new File("poonam.txt");
      File[] files=folder.listFiles();
        System.out.println(files.length);
    }
}