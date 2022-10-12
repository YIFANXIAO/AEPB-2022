package com.example.aepb.entity;

public class ParkingLot {

    private Integer remainingCount;

    private Double vacancyRate;

    public Integer getRemainingCount() {
        return remainingCount;
    }

    public Double getVacancyRate() {
        return vacancyRate;
    }

    public void setRemainingCount(Integer remainingCount) {
        this.remainingCount = remainingCount;
    }

    public ParkingLot(Integer remainingCount, Double vacancyRate) {
        this.remainingCount = remainingCount;
        this.vacancyRate = vacancyRate;
    }

    public void parkingSpacesMinusOne() {
        remainingCount--;
    }

}
