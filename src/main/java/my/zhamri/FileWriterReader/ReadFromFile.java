package my.zhamri.FileWriterReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

    public static void main(String[] args) {
        int size = 0;
        char[] country = new char[50];
        File file = new File("ExampleFile1.txt");
        try {
            FileReader fileReader = new FileReader(file);
            size = fileReader.read(country);
            System.out.println("Size = " + size);
            for (char c : country) {
                System.out.print(c);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
