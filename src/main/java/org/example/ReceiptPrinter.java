package org.example;

import java.sql.SQLOutput;

public class ReceiptPrinter {
    private final Ride ride;
    private final double totalFare;

    public ReceiptPrinter(Ride ride, double totalFare){
        this.ride = ride;
        this.totalFare = totalFare;
    }

    public void printCurrentReceipt(){
        System.out.println("--- Receipt ---");
        System.out.println("Ride Type: " + ride.getType());
        System.out.printf("Distance: %.2f km%n", ride.getDistance());
        System.out.printf("Duration: %.2f mins%n", ride.getDuration());
        System.out.printf("Total Fare: %.2f%n", totalFare);
    }
}
