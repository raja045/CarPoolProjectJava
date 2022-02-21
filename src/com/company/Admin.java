package com.company;
import java.util.ArrayList;

public class Admin extends User{
    int Total =0;
    ArrayList<Ride> ridelist = new ArrayList<Ride>();
    int Totalfare(){
        for (Ride ride : ridelist)
            Total = Total + ride.getFare();
        return Total;}


    ArrayList<String> getAllplaces() {
        ArrayList<String> cityList = new ArrayList<String>();
        for (Ride ride : ridelist) {

            if (!cityList.contains(ride.getSource()))
                cityList.add(ride.getSource());
            if (!cityList.contains(ride.getDestination()))
                cityList.add(ride.getDestination());
        }
        return cityList;
    }


}


