package org.example;

public class FareCalculator {
    private final FareStrategy fareStrategy;

    public FareCalculator(FareStrategy fareStrategy) {
        this.fareStrategy = fareStrategy;
    }

    public FareBreakdown calculateFare(Ride ride) {
        return fareStrategy.calculateFare(ride);
    }
}
