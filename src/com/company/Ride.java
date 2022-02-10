
package com.company;

public class Ride {
    private String source;
    private String destination;
    private int fare;

    @Override
    public String toString() {
        return "Ride{" +
                "source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", fare=" + fare +
                '}';
    }

    public Ride(String source, String destination, int fare)
    {
        this.destination = destination;
        this.source = source;
        this.fare = fare;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }
}

