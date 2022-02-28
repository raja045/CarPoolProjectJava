package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
    Connection connection = null;
    Statement statement = null;

    void displayPaticularRide(String source, String destination) throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/raja", "rajashekar", "1234");
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select id, source, destination,fare from ride where source ='" + source + "'and destination ='" + destination + "';");
        System.out.println("ID Source  Destination Fare");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getInt(4));
        }
    }

//        void bookRide(int id,int userid) throws SQLException{
//            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/raja", "rajashekar", "1234");
//            statement =  connection.createStatement();
//            String update = "update ride set available = false where id ="+id+"and userid"+userid;
//            int i = statement.executeUpdate(update);
//            if(i==1)
//                System.out.println("Ride is Booked Successfully");
//            else
//                System.out.println("Booking is Unsuccessfull");
//
//        }

        void availableRides()throws SQLException{
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/raja","rajashekar","1234");
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select id,source,destination,fare from ride where available =true;");
            System.out.println("Id Source Destination Fare");
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getInt(4));
        }
        }














//    static ArrayList<Ride> ridelist = new ArrayList<Ride>();
//    Scanner scuser = new Scanner(System.in);
//
//    int Total = 0;
//    int id = 0;
//
//    void createRide(String source, String destination, int fare) {
//
//
//        id = id + 1;
//        Ride ride = new Ride(id, source, destination, fare);
//        ridelist.add(ride);
//     // Ridedb rd = new Ridedb();
//      // rd.saveRide();
//    }
//
////   // void bookride(){
////        if(ridelist.contains(ride))
////    }
//
//    void displayRide1() {
//        for (Ride ride : ridelist)
//            System.out.println(ride);
//
//    }
//
//    ArrayList<String> getallSource(String destination) {
//
//        ArrayList<String> sourceList = new ArrayList<>();
//        for (Ride ride : ridelist) {
//            if (ride.getDestination().equals(destination))
//                sourceList.add(ride.getSource());
//        }
//        return sourceList;
//    }
//
//    ArrayList<String> getallDestination(String source) {
//        ArrayList<String> destList = new ArrayList<>();
//
//        for (Ride ride : ridelist) {
//            if (ride.getSource().equals(source))
//                destList.add(ride.getDestination());
//        }
//        return destList;
//    }
//
//    void deleteRide(int id) {
//
//        //it gives output not a proper way
//        // ridelist.remove(id-1);
//
//    /*    for(Ride ride:ridelist)
//            if(ride.getId()==id)
//                ridelist.remove(ride); */ // ---throwing an execption
//
//        for (int i = 0; i < ridelist.size(); i++)
//            if (ridelist.get(i).getId() == id ) {
//                ridelist.remove(ridelist.get(i));
//                System.out.println("Ride is deleted");
//            }
//    }
//
//    void updateRide(int id, String source, String destination, int fare) {
//        for (Ride ride : ridelist) {
//            if (id == ride.getId())
//                ride.setSource(source);
//            ride.setDestination(destination);
//            ride.setFare(fare);
//        }
//    }
}

