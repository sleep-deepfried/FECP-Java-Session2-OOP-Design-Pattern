package org.example;

public class PremiumRide extends Ride {

    public PremiumRide(double distance, double duration) {
        super(distance, duration);
    }

    @Override
    public String getType() {
        return "Premium";
    }

    @Override
    public double getBaseFare() {
        return 50.0;
    }
}

