package org.example;

public class StandardRide extends Ride {

    public StandardRide(double distance, double duration) {
        super(distance, duration);
    }

    @Override
    public double calculateFare() {
        return 40 + (10 * distance) + (2 * duration);
    }

    @Override
    public String getType() {
        return "Standard";
    }
}
