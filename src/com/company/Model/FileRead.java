package com.company.Model;
import com.company.Controller.Output;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
    Output output = new Output();

    public void writeString() {
        try {
            String result;
            FileReader fileReader = new FileReader("list.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNext()) {
                result = scanner.nextLine();
                output.getData(result);
                fileReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




