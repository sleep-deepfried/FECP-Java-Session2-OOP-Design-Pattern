package org.example;

import java.util.Scanner;

public class BookRideHandler {
    private final BookingService bookingService = new BookingService();
    private final Scanner scanner = new Scanner(System.in);

    public void startBooking() {
        System.out.println("\nBook a Ride:");
        System.out.print("Enter Ride Type (Standard/Premium): ");
        String type = scanner.nextLine();

        System.out.print("Enter Distance (km): ");
        double distance = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter Duration (minutes): ");
        double duration = Double.parseDouble(scanner.nextLine());

        bookingService.bookRide(type, distance, duration);
    }

    public BookingService getBookingService() {
        return bookingService;
    }
}

