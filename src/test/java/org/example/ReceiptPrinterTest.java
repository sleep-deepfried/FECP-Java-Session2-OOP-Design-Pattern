package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ReceiptPrinterTest {
    BookingService bookingService;

    @Test
    void testPrintCurrentReceipt() {
        bookingService = new BookingService();
        bookingService.bookRide("standard", 10.0, 15.0);
        Ride ride = bookingService.getLastBookedRide();
        double totalFare = 150.0;
        ReceiptPrinter printer = new ReceiptPrinter(ride, totalFare);

        // Capture System.out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Act
        printer.printCurrentReceipt();

        // Cleanup: restore System.out
        System.setOut(originalOut);

        // Assert: check the output contains expected data
        String output = outContent.toString();
        assertTrue(output.contains("--- Receipt ---"));
        assertTrue(output.contains("Ride Type: Standard"));
        assertTrue(output.contains("Distance: 10.00 km"));
        assertTrue(output.contains("Duration: 15.00 mins"));
        assertTrue(output.contains("Total Fare: 150.00"));
    }
}
