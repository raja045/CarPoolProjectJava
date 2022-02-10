package com.company;

public class Main {
    public static void main(String[] args)
    {
        Admin admin = new Admin();
        admin.createRide("delhi","Agra",240);
        admin.createRide("delhi","banglore",800);
        admin.createRide("punjab","delhi",1000);
        admin.createRide("chandigarh","delhi",1200);
        admin.createRide("punjab","chandigarh",200);
        admin.displayRide();
       // System.out.println(admin.getAllSource("delhi"));
        //System.out.println(admin.getAllDestination("punjab"));
        //System.out.println(admin.getAllPlaces());
        //System.out.println(admin.totalFare());
    }
}