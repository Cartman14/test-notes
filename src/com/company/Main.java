package com.company;
import com.company.Controller.Notify;
import com.company.View.PrintMenu;

public class Main {

    public static void main(String[] args) {
        PrintMenu printMenu = new PrintMenu();
        printMenu.printmenu();
        Notify notify = new Notify();
        notify.run();
    }
}



