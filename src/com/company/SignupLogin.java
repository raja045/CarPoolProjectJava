package com.company;

import java.sql.SQLException;
import java.util.Scanner;

public class SignupLogin {

     Scanner enteringdetails = new Scanner(System.in);

     int signup() throws SQLException {
          System.out.println("Enter 1 to signup and Enter 2 to login");
          int login = enteringdetails.nextInt();
          if (login == 1) {
               System.out.println("Enter your name:");
               String name = enteringdetails.next();
               System.out.print("Enter your email/username: ");
               String username = enteringdetails.next();
               if (Usersdb.checkuser(username) > 0) {
                    System.out.println("Email Already exists..!,Try to login");
                    return signup();
               } else {
                    System.out.println("Please enter your password to login:");
                    String password = enteringdetails.next();
                    Usersdb.createuser(name, username, password);
                    System.out.println("User Created Successfully..please login!!");
                    return signup();
               }
          } else if (login == 2) {
               System.out.println("Please enter your username:");
               String username = enteringdetails.next();
               System.out.println("Please enter your password:");
               String password = enteringdetails.next();

               int id = Usersdb.checkpassword(username,password);
               if(id==0){
                    System.out.println("Entered Incorrect Username / password. Create an account if you don't have one ");
               return signup();}
               else {
                    System.out.println("Successfully logged in");
             }
          }
          return 0;
     }
}
