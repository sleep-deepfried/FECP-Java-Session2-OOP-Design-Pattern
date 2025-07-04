package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class FareCalculatorHandlerTest {
    FareCalculatorHandler fareCalculatorHandler;
    BookingService bookingService;


    @BeforeEach
    void setup(){
        bookingService = new BookingService();
        fareCalculatorHandler = new FareCalculatorHandler(bookingService);
    }

    @Test
    void startFareCalculationTestingNormal() {
        bookingService.bookRide("standard", 15, 20);

        String input = "normal\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        double fare = fareCalculatorHandler.startFareCalculation();

        System.setIn(originalIn);

        assertTrue(fare > 0, "Fare should be greater than 0");
        assertEquals(220, fare, 0.01);

    }

    @Test
    void startFareCalculationTestingNight() {
        bookingService.bookRide("standard", 15, 20);

        String input = "night\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        double fare = fareCalculatorHandler.startFareCalculation();

        System.setIn(originalIn);

        assertTrue(fare > 0, "Fare should be greater than 0");
        assertEquals(250, fare, 0.01);

    }

    @Test
    void startFareCalculationInvalidFareType() {
        bookingService.bookRide("standard", 15, 20);

        String input = "invalidType\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        double fare = fareCalculatorHandler.startFareCalculation();

        System.setIn(originalIn);

        assertEquals(-1, fare, "Fare should be -1 for invalid fare type");
    }

    @Test
    void startFareCalculationWithoutRide() {
        double fare = fareCalculatorHandler.startFareCalculation();

        assertEquals(-1, fare, "Fare should be -1 for invalid fare type");
    }

}