package org.example;

import java.util.ArrayList;
import java.util.List;

public class BookingService {
    private final List<Ride> bookedRides = new ArrayList<>();

    public void bookRide(String type, double distance, double duration) {
        Ride ride = RideFactory.createRide(type, distance, duration);
        bookedRides.add(ride);
        System.out.println("Ride booked successfully: " + type);
    }

    public List<Ride> getBookedRides() {
        return bookedRides;
    }
}

