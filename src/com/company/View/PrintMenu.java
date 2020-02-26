package com.company.View;

import com.company.Controller.LogController;
import com.company.Controller.MenuController;

public class PrintMenu {

    MenuController menuController = new MenuController(this);
    LogController logController = new LogController();

    public void printmenu(){
        System.out.println("1. Add task");
        System.out.println("2. Remove task");
        System.out.println("3. Show task");
        System.out.println("4. Exit");
        menuController.startmenu();
    }
    public void error(){
        logController.log();
        System.out.println("Wrong num, try again");
        printmenu();

    }
}
