package com.example.bookdoc.dal.queries;

public class AdminQueries {

    //INSERT query
    public static final String INSERT_QUERY = "INSERT INTO book_my_doc.admin " +
            "(id, password, name)  VALUES  " + "(%d,'%s','%s')";

    //DELETE All query
    public static final String DELETE_QUERY = "DELETE FROM book_my_doc.admin";

    //DELETE By name
    public static final String DELETE_QUERY_BY_ID = "DELETE FROM book_my_doc.admin WHERE id='%s'";

    //SELECT By ID
    public static final String SELECT_QUERY_BY_ID = "SELECT * FROM book_my_doc.admin WHERE id='%s'";

}


