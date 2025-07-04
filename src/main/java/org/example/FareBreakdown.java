package org.example;

public class FareBreakdown {
    public double baseFare;
    public double distanceCost;
    public double durationCost;
    public double surcharge;
    public double total;

    public FareBreakdown(double baseFare, double distanceCost, double durationCost, double surcharge) {
        this.baseFare = baseFare;
        this.distanceCost = distanceCost;
        this.durationCost = durationCost;
        this.surcharge = surcharge;
        this.total = baseFare + distanceCost + durationCost + surcharge;
    }
}
