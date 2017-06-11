package com.example.bookdoc.dal.queries;

public class DoctorQueries {

    //INSERT query
    public static final String INSERT_QUERY = "INSERT INTO book_my_doc.doctor " +
            "(id, password, name, age, speciality, pin)  VALUES  "
            + "(%d,'%s','%s','%s','%s',%d)";

    //DELETE All query
    public static final String DELETE_QUERY = "DELETE FROM book_my_doc.doctor";

    //DELETE By name
    public static final String DELETE_QUERY_BY_ID = "DELETE FROM book_my_doc.doctor WHERE id=%d";

    //SELECT By ID
    public static final String SELECT_QUERY_BY_ID = "SELECT * FROM book_my_doc.doctor WHERE id='%s'";

    //
    public static final String SELECT_ALL_QUERY = "SELECT * FROM book_my_doc.doctor";
}
