package com.company.Controller;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class LogController {

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date data = new Date();

    public void log(){
        try {

            FileWriter fileWriter = new FileWriter("log4.txt", true);
            fileWriter.write("[ " + dateFormat.format(data) + " ] " + " User input error logged" + "\n");
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }


    }




}
