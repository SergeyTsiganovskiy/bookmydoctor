package com.example.bookdoc.dal.repositories;

import com.example.bookdoc.dal.DbQueries;
import com.example.bookdoc.dal.models.AdminDal;
import com.example.bookdoc.dal.queries.AdminQueries;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.example.bookdoc.tools.TestConfig.*;

public class AdminRepository {
    public static void createAdminInDb(AdminDal adminDal) throws SQLException, ClassNotFoundException {
        try(DbQueries dbQueries = new DbQueries(URL, UserName, Password)){
            dbQueries.insert(String.format(AdminQueries.INSERT_QUERY,
                    adminDal.getId(),adminDal.getPassword(),adminDal.getName()));
        }
    }

    public static void deleteAllAdminsInDb() throws SQLException, ClassNotFoundException {
        try(DbQueries dbQueries = new DbQueries(URL, UserName, Password)){
            dbQueries.delete(AdminQueries.DELETE_QUERY);
        }
    }

    public static void deleteAdminByIdInDb(String AdminId) throws SQLException, ClassNotFoundException {
        try(DbQueries dbQueries = new DbQueries(URL, UserName, Password)){
            dbQueries.delete(String.format(AdminQueries.DELETE_QUERY_BY_ID, AdminId));
        }
    }

    public static boolean isAdminInDbById(String AdminId) throws SQLException, ClassNotFoundException {
        try(DbQueries dbQueries = new DbQueries(URL, UserName, Password)){
            ResultSet resultSet = dbQueries.select(String.format(AdminQueries.SELECT_QUERY_BY_ID, AdminId));
            return resultSet.next();
        }
    }
}
