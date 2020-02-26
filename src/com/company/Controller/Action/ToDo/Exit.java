package com.company.Controller.Action.ToDo;

import com.company.Controller.Action.Action;

public class Exit implements Action {
    @Override
    public void action() {
        System.exit(0);
    }
}
