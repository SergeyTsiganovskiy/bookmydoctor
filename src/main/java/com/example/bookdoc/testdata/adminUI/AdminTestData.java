package com.example.bookdoc.testdata.adminUI;

public class AdminTestData {

    public static AdminUI getValidAdminUI(){
        return new AdminUI.AdminUIBuilder().Id("10000").Password("AdminPassword").build();
    }

    public static AdminUI getInValidAdminUIById(){
        return new AdminUI.AdminUIBuilder().Id("abc").Password("AdminPassword").build();
    }

    public static AdminUI getInValidAdminUIByPassword(){
        return new AdminUI.AdminUIBuilder().Id("10000").Password("WrongPassword").build();
    }

}
