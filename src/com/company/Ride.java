
package com.company;

public class Ride {

    private int id;
    private String source;
    private  String destination;
    private int fare;



    public Ride(int id,String source, String destination, int fare )
    {
        this.source = source;
        this.destination = destination;
        this.fare = fare;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "id=" + id +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", fare=" + fare +
                '}';
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getFare() {
        return fare;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}


