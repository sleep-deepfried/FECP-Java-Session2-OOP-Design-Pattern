package org.example;

public interface FareStrategy {
    FareBreakdown calculateFare (Ride ride);
}
