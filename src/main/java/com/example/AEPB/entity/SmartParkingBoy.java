package com.example.AEPB.entity;

public class SmartParkingBoy {

    private ParkingLot parkingLotA;

    private ParkingLot parkingLotB;

    public SmartParkingBoy(ParkingLot parkingLotA, ParkingLot parkingLotB) {
        this.parkingLotA = parkingLotA;
        this.parkingLotB = parkingLotB;
    }

    public ParkingResult parkingCar(Car car) {
        return new ParkingResult("car already parking in ParkingLotA", new Ticket());
    }

}
