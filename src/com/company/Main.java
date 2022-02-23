package com.company;

import java.sql.SQLException;

public class Main {

    static SignupLogin signupLogin = new SignupLogin();
    public static void main(String[] args) throws SQLException {

        int id = signupLogin.signup();
        System.out.println(id);
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

        Ridedb db = new Ridedb();
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


    }


