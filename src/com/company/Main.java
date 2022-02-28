package com.company;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    static SignupLogin signupLogin = new SignupLogin();
    static Scanner sc = new Scanner(System.in);
    public static void ui(int uiid) throws SQLException {
        String source;
        String destination;
        int fare;
        int id;
        int op = -1;
        int result;

        User user = new User();
        Admin admin = new Admin();


        while (op != 0) {
            System.out.println(" ");
            System.out.print("Enter 1 to Create a Ride          ");
            System.out.println("Enter 2 to Update the ride");
            System.out.print("Enter 3 to Delete Ride          ");
            System.out.println("Enter 4 to display all Destination Places:");
            System.out.println("Enter 5 to display all Source Places:");
            System.out.println("Enter 6 to display Total Fare earned:");
            System.out.println("Enter 7 to display all the rides");
            System.out.println("Enter 8 to display all available rides:");
            System.out.println("Enter 9 to display a praticular ride:");

            System.out.println("Please Provide your input here:");
            op = sc.nextInt();
            switch (op) {
                case 0:
                    System.out.println("Logged Out successfully!...");
                    break;
                case 1:
                    System.out.println("Enter id:");
                    id = sc.nextInt();
                    System.out.println("Enter source:");
                    source = sc.next();
                    System.out.println("Enter destination:");
                    destination = sc.next();
                    System.out.println("Enter fare:");
                    fare = sc.nextInt();
                    Ridedb.createRide(id, source, destination, fare);
                    break;
                case 2:
                    System.out.println("Enter ride id:");
                    id = sc.nextInt();
                    System.out.println("Enter source:");
                    source = sc.next();
                    System.out.println("Enter destination:");
                    destination = sc.next();
                    System.out.println("Enter fare:");
                    fare = sc.nextInt();
                    Ridedb.updateRide(id, source, destination, fare);
                    break;
                case 3:
                    System.out.println("Enter id");
                    id = sc.nextInt();
                    result = Ridedb.deleteRide(id);
                    break;
                case 4:
                    System.out.println("Enter the Source Place to Get All the Destinations:");
                    source = sc.next();
                    admin.allDestination(source);
                    break;
                case 5:
                    System.out.println("Enter the destination Place to get All the Source places:");
                    destination = sc.next();
                    admin.allSource(destination);
                    break;
                case 6:
                    System.out.print("Total Fare : ");
                    admin.totalFare();
                    break;
                case 7:
                    System.out.println("Displaying all the rides: ");
                    admin.displayride();
                    break;
                case 8:
                    System.out.println("Displaying available rides: ");
                    user.availableRides();
                    break;
                case 9:
                    System.out.print("Enter source: ");
                    source = sc.next();
                    System.out.print("Enter destination: ");
                    destination = sc.next();
                    System.out.println("Displaying the particular ride: ");
                    user.displayPaticularRide(source, destination);
            }
        }
    }


//        int id = signupLogin.signup();
//        System.out.println(id);

    // admin.allSource("delhi");
    // System.out.println(admin.totalFare());
    //admin.allDestination("delhi");
    //     user.displayride();
    // user.displayPaticularRide("khammam","delhi");
    // user.availableRides();

    //  admin.totalFare();
    //  admin.allDestination("khammam");
    // admin.allSource("delhi");
    //System.out.println("-----------------------------------");
    // admin.displayride();

    public static void main(String[] args) throws SQLException {
        int uiid = signupLogin.signup();
        System.out.println(uiid);
        ui(uiid);

//        Usersdb usersdb = new Usersdb();
//        System.out.println( usersdb.checkuser("vasu@gmail.com"));

    }



}










//        System.out.println("Enter 1 for login");
//        int lognum = sc.nextInt();
//        if(lognum==1)
//        {
//
//        }


//        Admin ob = new Admin();
//        User raja = new User();
//        User sai = new User();
//        ob.createRide("delhi","chandigarh",500);
//        ob.createRide("agra","chandigarh",500);
//        ob.createRide("delhi","punjab",400);
//
//        raja.createRide("Hyderabad","delhi",800);
//        raja.createRide("delhi","phagwara",150);
//
//        sai.createRide("delhi","jaipur",500);
//        sai.createRide("mumbai","gao",1200);

      //  Ridedb db = new Ridedb();
      //  String name;
       // Login login = new Login();
       // login.signingup();


       // db.saveRide(10,"delhi","chandigarh",500);
        //db.saveRide(11,"agra","chandigarh",500);
        //db.saveRide(12,"delhi","punjab",400);
        //db.saveRide(13,"Hyderabad","delhi",800);
       // db.getRide();




        // db.saveRide();
       //  db.updateRide(2,"pune","chennai",1000);
        //  ob.displayRide();
        //ob.deleteRide(2);
        // ob.displayRide();
        //System.out.println(ob.getallSource("chandigarh"));
        //System.out.println(ob.getallDestination("delhi"));
        // System.out.println(ob.Totalfare());
        // System.out.println(ob.getallSource("chandigarh"));

        // System.out.println(ob.getAllplaces());
//ob.updateRide(2,"hyderabad","warangal",500);
//ob.displayRide();

       // User raja = new User();
       // raja.createRide("khammam","delhi",800);
       // raja.displayRide();


   // }


