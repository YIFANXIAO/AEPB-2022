package com.example.aepb.entity;

public class ParkingLot {

    private Integer remainingCount;

    public Integer getRemainingCount() {
        return remainingCount;
    }

    public void setRemainingCount(Integer remainingCount) {
        this.remainingCount = remainingCount;
    }

    public ParkingLot(Integer remainingCount) {
        this.remainingCount = remainingCount;
    }

    public void parkingSpacesMinusOne() {
        remainingCount--;
    }

}
