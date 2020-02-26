package com.company.Controller.Action.ToDo;
import com.company.Controller.Action.Action;
import com.company.Model.FileWrite;


public class Add implements Action {
FileWrite fileWrite = new FileWrite();

    @Override
    public void action() {
        fileWrite.addString();

    }
}
