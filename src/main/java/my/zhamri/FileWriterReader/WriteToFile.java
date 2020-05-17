package my.zhamri.FileWriterReader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) {

        File file = new File("ExampleFile2.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("China\n");
            fileWriter.write("Italy\n");
            fileWriter.write("India\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Finish");
    }
}
