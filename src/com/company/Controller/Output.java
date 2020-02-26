package com.company.Controller;

import com.company.View.ResultView;

public class Output {
    ResultView resultView = new ResultView();
    String result;

    public void getData(String result) {
        this.result = result;
        sendData(this.result);
    }

    public void sendData(String result) {
        resultView.show(result);
    }

}
