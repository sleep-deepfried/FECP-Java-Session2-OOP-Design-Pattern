package org.example;

import java.util.Scanner;

public class FareCalculatorHandler {
    private final BookingService bookingService;

    public FareCalculatorHandler(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public void startFareCalculation() {
        Scanner scanner = new Scanner(System.in);

        Ride ride = bookingService.getLastBookedRide();
        if (ride == null) {
            System.out.println("No ride booked yet.");
            return;
        }

        System.out.print("Fare Type (normal/night): ");
        String type = scanner.nextLine().toLowerCase();

        FareStrategy strategy = switch (type) {
            case "normal" -> new NormalFareStrategy();
            case "night" -> new NightFareStrategy();
            default -> {
                System.out.println("Invalid fare type.");
                yield null;
            }
        };

        if (strategy == null) return;

        FareCalculator calculator = new FareCalculator(strategy);
        FareBreakdown breakdown = calculator.calculateFare(ride);

        System.out.println("==== Fare Breakdown ====");
        System.out.printf("Base fare: %.2f%n", breakdown.baseFare);
        System.out.printf("Distance cost: %.2f%n", breakdown.distanceCost);
        System.out.printf("Duration cost: %.2f%n", breakdown.durationCost);
        if (breakdown.surcharge > 0) {
            System.out.printf("Surcharge (Night): %.2f%n", breakdown.surcharge);
        }
        System.out.printf("Total Fare: %.2f%n", breakdown.total);
    }
}
