package com.company.Controller.Action.ToDo;
import com.company.Controller.Action.Action;
import com.company.Model.FileRead;

public class Show implements Action {
    FileRead fileRead = new FileRead();

    @Override
    public void action() {
        fileRead.writeString();

    }
}
