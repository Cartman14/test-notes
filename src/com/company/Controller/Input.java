package com.company.Controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Input {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();
    Scanner scanner = new Scanner(System.in);
    String string;
    int a;

    public Date inputDate () throws ParseException {
        System.out.println("Введите дату в фотмате yyyy/MM/dd HH:mm:ss");
        date = simpleDateFormat.parse(scanner.nextLine());
        return date;
    }

    public String inputString() {
        System.out.println("Введите заметку");
        string = scanner.nextLine();
        return string;
    }
    public int inputInt(){
        System.out.println("Введите номер строки для удаления ");
        a = scanner.nextInt();
        return a-1;
    }
}
