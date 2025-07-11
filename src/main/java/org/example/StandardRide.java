package org.example;

public class StandardRide extends Ride {

    public StandardRide(double distance, double duration) {
        super(distance, duration);
    }

    @Override
    public String getType() {
        return "Standard";
    }

    @Override
    public double getBaseFare() {
        return 30.0;
    }
}
