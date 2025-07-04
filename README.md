# Group 15: Ride Fare Calculator
## Members
1. Gideon Antony Salangsang
2. Earl John Pulido
3. Luis Maverick Gabriel
## Output

## Description
Ride Fare Calculator is a Java console application that allows users to:
- Book a ride by selecting vehicle type (Standard or Premium)
- Compute fare dynamically based on distance, duration, and surcharges
- Apply different fare strategies (Normal and Night) using the Strategy Pattern
- Generate and display a detailed receipt
- Ensure modularity and scalability with the Factory Pattern

## Project Structure
```
RideBookingSystem/
├── src/
│   └── org/
│       └── example/
│           ├── BookingService.java
│           ├── BookRideHandler.java
│           ├── FareBreakdown.java
│           ├── FareCalculator.java
│           ├── FareCalculatorHandler.java
│           ├── FareStrategy.java
│           ├── Main.java
│           ├── NightFareStrategy.java
│           ├── NormalFareStrategy.java
│           ├── PremiumRide.java
│           ├── ReceiptPrinter.java
│           ├── Ride.java
│           ├── RideFactory.java
│           └── StandardRide.java
├── test/
│   └── java/
│       └── org/
│           └── example/
│               ├── BookingServiceTest.java
│               ├── FareCalculatorHandlerTest.java
│               └── ReceiptPrinterTest.java
├── README.md
└── .gitignore
```




### Booking a ride
![img.png](img.png)
### Calculating Fare
![img_1.png](img_1.png)
### Printing Receipt
![img_2.png](img_2.png)
### Exiting
![img_3.png](img_3.png)

