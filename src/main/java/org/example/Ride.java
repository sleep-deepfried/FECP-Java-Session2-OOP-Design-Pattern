package org.example;

public abstract class Ride {
    protected double distance; // in km
    protected double duration; // in mins

    public Ride(double distance, double duration) {
        this.distance = distance;
        this.duration = duration;
    }

    public double getDistance() {
        return distance;
    }

    public double getDuration() {
        return duration;
    }

    public abstract String getType();
}
