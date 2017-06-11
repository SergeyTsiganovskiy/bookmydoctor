package com.example.bookdoc.dal.repositories;

import com.example.bookdoc.dal.DbQueries;
import com.example.bookdoc.dal.models.AdminDal;
import com.example.bookdoc.dal.models.DoctorDal;
import com.example.bookdoc.dal.queries.AdminQueries;
import com.example.bookdoc.dal.queries.DoctorQueries;
import com.example.bookdoc.testdata.doctorUI.DoctorType;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.example.bookdoc.tools.TestConfig.Password;
import static com.example.bookdoc.tools.TestConfig.URL;
import static com.example.bookdoc.tools.TestConfig.UserName;

public class DoctorRepository {
    public static void createDoctorInDb(DoctorDal doctorDal) throws SQLException, ClassNotFoundException {
        try(DbQueries dbQueries = new DbQueries(URL, UserName, Password)){
            dbQueries.insert(String.format(
                    DoctorQueries.INSERT_QUERY, doctorDal.getId(),doctorDal.getPassword(),doctorDal.getName()
                    ,doctorDal.getAge(),doctorDal.getSpeciality(),doctorDal.getPin()));
        }
    }

    public static void deleteAllDoctorsInDb() throws SQLException, ClassNotFoundException {
        try(DbQueries dbQueries = new DbQueries(URL, UserName, Password)){
            dbQueries.delete(DoctorQueries.DELETE_QUERY);
        }
    }

    public static void deleteDoctorById(DoctorDal doctorDal) throws SQLException, ClassNotFoundException {
        try(DbQueries dbQueries = new DbQueries(URL, UserName, Password)){
            dbQueries.delete(String.format(DoctorQueries.DELETE_QUERY_BY_ID, doctorDal.getId()));
        }
    }

    public static DoctorDal getDoctorById(String id) throws SQLException, ClassNotFoundException {
        try(DbQueries dbQueries = new DbQueries(URL, UserName, Password)){
            ResultSet resultSet = dbQueries.select(String.format(DoctorQueries.SELECT_QUERY_BY_ID, id));
            resultSet.next();

            return getDoctorDal(resultSet);
        }
    }

    public static DoctorDal getAllDoctor() throws SQLException, ClassNotFoundException {
        try(DbQueries dbQueries = new DbQueries(URL, UserName, Password)){
            ResultSet resultSet = dbQueries.select(String.format(DoctorQueries.SELECT_ALL_QUERY));
            resultSet.next();

            return getDoctorDal(resultSet);
        }
    }

    private static DoctorDal getDoctorDal(ResultSet resultSet) throws SQLException {
        DoctorDal.DoctorDalBuilder doctorDalBuilder = new DoctorDal.DoctorDalBuilder();

        return doctorDalBuilder.Id(resultSet.getInt("ID"))
                .Password(resultSet.getString("PASSWORD"))
                .Name(resultSet.getString("NAME"))
                .Speciality(resultSet.getString("SPECIALITY"))
                .Age(resultSet.getString("AGE"))
                .Pin(resultSet.getInt("PIN"))
                .build();

    }
}
