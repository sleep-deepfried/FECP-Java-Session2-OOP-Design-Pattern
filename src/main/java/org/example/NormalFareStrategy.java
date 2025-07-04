package org.example;

public class NormalFareStrategy implements FareStrategy {

    @Override
    public FareBreakdown calculateFare(Ride ride) {
        double baseFare = ride.getBaseFare();
        double distanceCost = ride.getDistance() * 10.0; // +10/km
        double durationCost = ride.getDuration() * 2.0; // +2/min
        double surcharge = 0.0;

        return new FareBreakdown(baseFare, distanceCost, durationCost, surcharge);
    }
}
