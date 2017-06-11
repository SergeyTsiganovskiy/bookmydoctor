package com.example.bookdoc.pages;

import com.example.bookdoc.pages.uimaps.AlertUIMap;

public class Alert {

    private AlertUIMap alertUIMap;

    public Alert() {
        alertUIMap = new AlertUIMap();
    }

    public String getAlertText(){
        return alertUIMap.getAlert().getText();
    }

    public void clickOkButton(){
        alertUIMap.getAlert().accept();
    }
}
