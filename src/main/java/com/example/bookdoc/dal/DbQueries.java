package com.example.bookdoc.dal;

import java.sql.*;

public class DbQueries implements AutoCloseable {

    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;

    public DbQueries(String Url,String user,String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(Url, user, password);
        statement = connection.createStatement();
    }
    // Wrappers for CRUD operations
    public int delete(String query) throws SQLException {
        return statement.executeUpdate(query);
    }

    public int insert(String query) throws SQLException {
        return statement.executeUpdate(query);
    }

    public int update(String query) throws SQLException {
        return statement.executeUpdate(query);
    }

    public ResultSet select(String query) throws SQLException {
        return statement.executeQuery(query);
    }

    @Override
    public void close() throws SQLException {
        statement.close();
        connection.close();
    }
}
