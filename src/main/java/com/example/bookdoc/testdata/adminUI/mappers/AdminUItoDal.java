package com.example.bookdoc.testdata.adminUI.mappers;

import com.example.bookdoc.dal.models.AdminDal;
import com.example.bookdoc.testdata.Mapper;
import com.example.bookdoc.testdata.adminUI.AdminUI;

import java.sql.SQLException;

public class AdminUItoDal implements Mapper<AdminDal, AdminUI> {

    private AdminUItoDal() {
    }

    public static AdminUItoDal getInstance() {
        return new AdminUItoDal();
    }

    @Override
    public AdminDal map(AdminUI adminUI) throws NumberFormatException {

        AdminDal.AdminDalBuilder adminDalBuilder = new AdminDal.AdminDalBuilder();

        if ((adminUI.getId() != null) && (adminUI.getId().length() > 0)) {
            adminDalBuilder.Id(Integer.parseInt(adminUI.getId()));
        } else {
            adminDalBuilder.Id(null);
        }

        if ((adminUI.getPassword() != null) && (adminUI.getPassword().length() > 0)) {
            adminDalBuilder.Password(adminUI.getPassword());
        } else {
            adminDalBuilder.Password(null);
        }

        return adminDalBuilder.build();
    }
}
