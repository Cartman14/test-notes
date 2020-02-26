package com.company.Controller;

import com.company.Controller.Action.Action;
import com.company.Controller.Action.ToDo.Add;
import com.company.Controller.Action.ToDo.Exit;
import com.company.Controller.Action.ToDo.Remove;
import com.company.Controller.Action.ToDo.Show;
import com.company.View.PrintMenu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuController {

    PrintMenu printMenu;

    public MenuController(PrintMenu printMenu) {
        this.printMenu = printMenu;
    }

    public void startmenu(){
        int choice;
        Map<Integer, Action> map = new HashMap<Integer, Action>();
        map.put(1,new Add());
        map.put(2,new Remove());
        map.put(3,new Show());
        map.put(4,new Exit());
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
         if (choice>0 & choice<5){
             map.get(choice).action();
         }
         else {
             printMenu.error();
         }

         }
}
