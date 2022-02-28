package com.company;

import java.sql.*;

public class Ridedb {
    static Connection connection = null;
    static Statement statement = null;
    static int i;

    static void createConnection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/raja", "rajashekar", "1234");
    }

    static void createRide(int id, String source, String destination, int fare) throws SQLException {
        try {
            createConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into ride values(?,?,?,?)");
            // preparedstatement = connection.createStatement();
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, source);
            preparedStatement.setString(3, source);
            preparedStatement.setInt(4, fare);
            preparedStatement.executeUpdate();
            System.out.println("Ride saved successfully");
        } catch (Exception e) {
            System.err.print(e);
        } finally {
            connection.close();
        }
    }

    void getRide() throws SQLException {

        try {
            statement = connection.createStatement();
            createConnection();
            ResultSet resultSet = statement.executeQuery("select * from ride");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getInt(2) + " " + resultSet.getInt(3) + " " + resultSet.getInt(4));
            }
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            connection.close();
        }
    }

    static int deleteRide(int id) throws SQLException {
        statement = connection.createStatement();
        try {
            createConnection();
           i = statement.executeUpdate("delete from ride where id=" + id);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            connection.close();
        }
        if(i==1){
            System.out.println("Successfully Deleted");
        }
        else{
            System.out.println("Deleted Failed.");
        }
    return i;}

    static void updateRide(int id, String source, String destination, int fare) throws SQLException {
        try {
            createConnection();
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/raja", "rajashekar", "1234");
            PreparedStatement preparedStatement = connection.prepareStatement("update ride set source=?,destination=?,fare=? where id=?");
            preparedStatement.setString(1, source);
            preparedStatement.setString(2, destination);
            preparedStatement.setInt(3, fare);
            preparedStatement.setInt(4, id);
           i= preparedStatement.executeUpdate();
           if(i==1)
               System.out.println("Ride is updated Successfully..!");
           else
               System.out.println("Updation failed...");

           /*  connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/raja","rajashekar",1234);
             statement = connection.createStatement();
             statement.executeUpdate("update ride set source=)
            statement.executeUpdate("update ride set source ="+"'"+source+"'"+",destination ="+"'"+destination+"'"+",fare="+fare+" where id="+id);
            //   System.out.println(); */
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            connection.close();
        }
    }
}

//    void createAccount(){
//     //   if()
//    }



