package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookingServiceTest {
    static BookingService bookingService;

    @BeforeEach
    void setup(){
        bookingService = new BookingService();
    }

    @Test
    void bookSingleRide() {
        bookingService.bookRide("standard", 15, 20);
        assertEquals(1, bookingService.getBookedRides().size());
        assertEquals("Standard", bookingService.getLastBookedRide().getType());
        assertEquals(15, bookingService.getLastBookedRide().getDistance());
        assertEquals(20, bookingService.getLastBookedRide().getDuration());
    }

    @Test
    void bookMultipleRide() {
        bookingService.bookRide("premium", 10, 18);
        bookingService.bookRide("standard", 30, 68);
        assertEquals(2, bookingService.getBookedRides().size());
    }
}