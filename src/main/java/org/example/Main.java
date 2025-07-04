package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BookRideHandler bookRideHandler = new BookRideHandler();
        FareCalculatorHandler fareCalculatorHandler = new FareCalculatorHandler(bookRideHandler.getBookingService());
        ReceiptPrinter receiptPrinter;
        double currentTotalFare = -1;


        int choice;
        while (true){
            System.out.println("=== Ride Booking System == ");
            System.out.println("""
                    1. Book a Ride \s
                    2. Calculate Fare \s
                    3. View Receipt \s
                    4. Exit \s
                    """);
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    bookRideHandler.startBooking();
                    break;
                case 2:
                    currentTotalFare = fareCalculatorHandler.startFareCalculation();
                    break;
                case 3:
                    receiptPrinter = new ReceiptPrinter(bookRideHandler.getBookingService().getLastBookedRide(), currentTotalFare);
                    receiptPrinter.printCurrentReceipt();;
                    break;
                case 4:
                    System.out.println("Thank you for riding with us!");
                    System.exit(0);
                default:
                    System.out.println("Enter Valid Choice (1 - 4)");
            }
            System.out.println();
        }
    }
}
