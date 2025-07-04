package org.example;

public class RideFactory {

    public static Ride createRide(String type, double distance, double duration) {
        return switch (type.toLowerCase()) {
            case "standard" -> new StandardRide(distance, duration);
            case "premium" -> new PremiumRide(distance, duration);
            default -> throw new IllegalArgumentException("Unknown ride type: " + type);
        };
    }
}
