package org.example;

public class NightFareStrategy implements FareStrategy {

    @Override
    public FareBreakdown calculateFare(Ride ride) {
        FareBreakdown normal = new NormalFareStrategy().calculateFare(ride);
        double nightSurcharge = 30.0; // Additional 30 charge

        return new FareBreakdown(
                normal.baseFare,
                normal.distanceCost,
                normal.durationCost,
                nightSurcharge
        );
    }
}
