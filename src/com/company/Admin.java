package com.company;
import java.sql.*;
import java.util.ArrayList;

public class Admin extends User{
    Connection connection = null;
    Statement statement =null;

    void createconnection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/raja","rajashekar","1234");
        statement = connection.createStatement();
    }


    void allDestination(String source) throws SQLException {
        try {
            createconnection();
            ResultSet resultSet = statement.executeQuery("select distinct destination from ride where source='"+source+"';");

            // ResultSet resultSet = statement.executeQuery("select destination from rides where source ='" + source + "';");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
        } catch (Exception e) {
            System.err.println(e);
        }finally {
            connection.close();
        }
    }


    void allSource(String destination) throws SQLException{
        try{
        createconnection();
        ResultSet resultSet = statement.executeQuery("select distinct source from ride where destination='"+destination+"';");
        while (resultSet.next()){
            System.out.println(resultSet.getString(1));
        }}catch (Exception e){
            System.err.println(e);
        }finally {
            connection.close();
        }
    }

    void displayride() throws SQLException{
        try {
            createconnection();
            ResultSet resultSet = statement.executeQuery("select * from ride;");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getInt(4));
            }
        }catch (Exception e){
            System.err.println(e);
        }finally {
            connection.close();
        }
    }

    int totalFare() throws SQLException{
        int total =0;
        try {
        createconnection();
        ResultSet resultSet = statement.executeQuery("select sum(fare) from ride;");
        while (resultSet.next()){
            total = total+resultSet.getInt(1);
        }}catch (Exception e){
            System.err.println(e);
        }finally {
            connection.close();
        }
        return total;
    }













//    int Total =0;
//    ArrayList<Ride> ridelist = new ArrayList<Ride>();
//    int Totalfare(){
//        for (Ride ride : ridelist)
//            Total = Total + ride.getFare();
//        return Total;}
//
//
//    ArrayList<String> getAllplaces() {
//        ArrayList<String> cityList = new ArrayList<String>();
//        for (Ride ride : ridelist) {
//
//            if (!cityList.contains(ride.getSource()))
//                cityList.add(ride.getSource());
//            if (!cityList.contains(ride.getDestination()))
//                cityList.add(ride.getDestination());
//        }
//        return cityList;
//    }
//

}


