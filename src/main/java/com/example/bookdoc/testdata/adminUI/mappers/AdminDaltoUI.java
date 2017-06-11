package com.example.bookdoc.testdata.adminUI.mappers;

import com.example.bookdoc.dal.models.AdminDal;
import com.example.bookdoc.testdata.Mapper;
import com.example.bookdoc.testdata.adminUI.AdminUI;

import java.sql.SQLException;

public class AdminDaltoUI implements Mapper<AdminUI, AdminDal> {

    private AdminDaltoUI() {
    }

    public static AdminDaltoUI getInstance(){
        return new AdminDaltoUI();
    }

    @Override
    public AdminUI map(AdminDal adminDal) throws NumberFormatException {
        AdminUI.AdminUIBuilder adminUIBuilder = new AdminUI.AdminUIBuilder();

        if (adminDal.getId()==null) adminUIBuilder.Id("");
        else adminUIBuilder.Id(String.valueOf(adminDal.getId()));

        if (adminDal.getPassword()==null) adminUIBuilder.Password("");
        else adminUIBuilder.Password(adminDal.getPassword());

        return adminUIBuilder.build();
    }
}
