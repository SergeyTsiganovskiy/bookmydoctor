package com.example.bookdoc.pages;

import com.example.bookdoc.pages.uimaps.AdminLoginPageUImap;

public class AdminLoginPage {

    private AdminLoginPageUImap adminLoginPageUImap;

    private AdminLoginPage() {
        this.adminLoginPageUImap = new AdminLoginPageUImap();
    }

    public static AdminLoginPage getAdminLoginPage(){
        return new AdminLoginPage();
    }

    public AdminLoginPage typeId(String id) {
        adminLoginPageUImap.getUserIdInput().sendKeys(id);
        return this;
    }

    public AdminLoginPage typePassword(String password) {
        adminLoginPageUImap.getPasswordInput().sendKeys(password);
        return this;
    }

    public void clickLoginButton() {
        adminLoginPageUImap.getLoginButton().click();
    }
}
