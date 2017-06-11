package com.example.bookdoc.dal.repositories;

import com.example.bookdoc.dal.DbQueries;
import com.example.bookdoc.dal.models.PatientDal;
import com.example.bookdoc.dal.queries.DoctorQueries;
import com.example.bookdoc.dal.queries.PatientQueries;

import java.sql.SQLException;

import static com.example.bookdoc.tools.TestConfig.Password;
import static com.example.bookdoc.tools.TestConfig.URL;
import static com.example.bookdoc.tools.TestConfig.UserName;

public class PatientRepository {
    public static void createPatientInDb(PatientDal patientDal) throws SQLException, ClassNotFoundException {
        try(DbQueries dbQueries = new DbQueries(URL, UserName, Password)){
            dbQueries.insert(String.format(
                    PatientQueries.INSERT_QUERY, patientDal.getId(),patientDal.getName(),
                    patientDal.getAge(),patientDal.getPassword()));
        }
    }

    public static void deleteAllPatientsInDb() throws SQLException, ClassNotFoundException {
        try(DbQueries dbQueries = new DbQueries(URL, UserName, Password)){
            dbQueries.delete(PatientQueries.DELETE_QUERY);
        }
    }

    public static void deletePatientById(PatientDal patientDal) throws SQLException, ClassNotFoundException {
        try(DbQueries dbQueries = new DbQueries(URL, UserName, Password)){
            dbQueries.delete(String.format(PatientQueries.DELETE_QUERY_BY_ID, patientDal.getId()));
        }
    }
}
