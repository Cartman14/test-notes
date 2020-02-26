package com.company.Controller;

import java.awt.*;
import java.io.FileReader;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Notify implements Runnable{

    @Override
    public void run() {

        try {
            String result;
            FileReader fileReader = new FileReader("list.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNext()) {
                result = scanner.nextLine();
                String[] subStr;
                String delimeter = "!";
                subStr = result.split(delimeter);
                if (SystemTray.isSupported()) {
                    SystemTray tray = SystemTray.getSystemTray();
                    Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
                    TrayIcon trayIcon = new TrayIcon(image, "Notification");
                    trayIcon.setImageAutoSize(true);
                    trayIcon.setToolTip("Notification");
                    try {
                        tray.add(trayIcon);
                    } catch (AWTException e) {
                        e.printStackTrace();
                    }
                    while(true){
                        try {
                            sleep(30000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                        Date date = new Date();
                        if(date.toString().equals(subStr[1]))
                            if(subStr[1].length() != 0) {
                                trayIcon.displayMessage("Notification", subStr[1], TrayIcon.MessageType.INFO);
                            }
                    }
                } else {
                    System.err.println("System tray not supported!");
                }
                fileReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


