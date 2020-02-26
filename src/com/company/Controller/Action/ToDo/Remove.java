package com.company.Controller.Action.ToDo;
import com.company.Controller.Action.Action;
import com.company.Model.FileEdit;



public class Remove implements Action {
    FileEdit fileEdit = new FileEdit();

    @Override
    public void action()   {
       fileEdit.removeString();

    }
}
