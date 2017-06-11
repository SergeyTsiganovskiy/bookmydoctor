package com.example.bookdoc.dal.queries;

public class PatientQueries {
    //INSERT query
    public static final String INSERT_QUERY = "INSERT INTO book_my_doc.patient " +
            "(id,  name, age, password)  VALUES  "
            + "(%d,'%s',%d,'%s')";

    //DELETE All query
    public static final String DELETE_QUERY = "DELETE FROM book_my_doc.patient";

    //DELETE By name
    public static final String DELETE_QUERY_BY_ID = "DELETE FROM book_my_doc.patient WHERE id=%d";

    //SELECT By ID
    public static final String SELECT_QUERY_BY_ID = "SELECT * FROM book_my_doc.patient WHERE id='%s'";
}
