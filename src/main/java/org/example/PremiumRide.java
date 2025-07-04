package org.example;

public class PremiumRide extends Ride {

    public PremiumRide(double distance, double duration) {
        super(distance, duration);
    }

    @Override
    public String getType() {
        return "Premium";
    }
}

