package com.company.Model;
import com.company.Controller.Input;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

public class FileWrite {
    Input input = new Input();
    public void addString() {
        try {
            FileWriter fileWriter = new FileWriter("list.txt", true);
            fileWriter.write(input.inputDate() + "! ");
            fileWriter.write(input.inputString() + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ParseException y){
            y.getErrorOffset();
        }
    }

}
