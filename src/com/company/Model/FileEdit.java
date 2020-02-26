package com.company.Model;
import com.company.Controller.Input;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileEdit {
    public void removeString() {
        Input input = new Input();
        try {
            File file = new File("list.txt");
            FileReader fileReader = new FileReader("list.txt");
            ArrayList<String> list = new ArrayList<String>();
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                list.add(line);
                fileReader.close();
            }
            list.remove(input.inputInt());
            for (String x : list) {
                FileWriter fileWriter = new FileWriter("list.txt", false);
                fileWriter.write(x + "\n");
                fileWriter.close();
            }
            if (list.size()==0);
            file.delete();

        } catch (IOException t) {
            t.printStackTrace();
        }
    }
}
