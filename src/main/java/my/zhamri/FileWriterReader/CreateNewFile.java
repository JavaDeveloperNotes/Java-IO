package my.zhamri.FileWriterReader;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

    public static void main(String[] args) {

        File file = new File("File1.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());
        String currentDirectory = System.getProperty("user.dir");
        System.out.println(currentDirectory);
    }
}
