package com.company;
import java.util.ArrayList;

public class Admin {

    ArrayList<Ride> ridelist = new ArrayList<>();
    int Totalfare=0;

    void createRide(String source, String destination, int fare){
        Ride ride = new Ride(source,destination,fare);
        ridelist.add(ride);
    }

    void displayRide(){
        for(Ride ride:ridelist)
            System.out.println(ride);
    }

    ArrayList<String> getAllPlaces(){
        ArrayList<String> placelist = new ArrayList<>();
        for(Ride ride :ridelist){
            if (!placelist.contains(ride.getSource()))
                placelist.add(ride.getSource());
            if (!placelist.contains(ride.getDestination()))
                placelist.add(ride.getDestination());
        }
        return placelist;
    }

    ArrayList<String> getAllSource(String destination){
        ArrayList<String> sourcelist = new ArrayList<>();
        for(Ride ride:ridelist)
            if(ride.getDestination().equals(destination))
                sourcelist.add(ride.getSource());
        return sourcelist;}

    ArrayList<String> getAllDestination(String source){
        ArrayList<String> destlist = new ArrayList<>();
        for(Ride ride:ridelist)
            if (ride.getSource().equals(source))
                destlist.add(ride.getDestination());
        return destlist;}

    int totalFare(){
        for(Ride ride :ridelist)
            Totalfare = Totalfare + ride.getFare();
        return Totalfare;}
}



