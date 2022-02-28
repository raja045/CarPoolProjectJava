package com.company;

import java.sql.*;

public class Usersdb {
    static Connection connection = null;
    Statement statement = null;

    static void createConnection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/raja", "rajashekar", "1234");
    }

    static void createuser(String name, String email, String password) throws SQLException {

        try {
            createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into pusers (name,email,password) values(?,?,?);");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            connection.close();
            System.out.println("Added data !");
        }
    }

    static Integer checkuser(String username) throws SQLException{
        try{
            createConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select userid from pusers where email ='"+username+"';");
            if(resultSet.next()){
                return resultSet.getInt(1);
            }}catch (Exception e){
            System.err.println(e);
        }
        return 0;
    }

    static Integer checkemail(String username) throws SQLException{
        try{
            createConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select userid from pusers where email='"+username+"';");
            if(resultSet.next()){
                return resultSet.getInt(1);
            }}catch (Exception e){
            System.err.println(e);
        }
        return 0;
    }

    static Integer checkpassword(String username,String password) throws SQLException{
        try {

            createConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select userid from pusers where email='" + username + "'and password = '" + password + "';");
            if (resultSet.next()) {
                return resultSet.getInt(1);
            }}catch (Exception e){
            System.err.println(e);
        }
        return 0;
    }
}
