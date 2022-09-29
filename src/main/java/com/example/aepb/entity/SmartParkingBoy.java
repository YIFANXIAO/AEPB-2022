package com.example.aepb.entity;

public class SmartParkingBoy {

    private ParkingLot parkingLotA;

    private ParkingLot parkingLotB;

    public SmartParkingBoy(ParkingLot parkingLotA, ParkingLot parkingLotB) {
        this.parkingLotA = parkingLotA;
        this.parkingLotB = parkingLotB;
    }

    public ParkingResult parkingCar(Car car) {
        if(parkingLotA.getRemainingCount() >= parkingLotB.getRemainingCount()) {
            parkingLotA.parkingSpacesMinusOne();
            return new ParkingResult("car already parking in ParkingLotA", new Ticket(car.getCarPlateName()));
        }

        parkingLotB.parkingSpacesMinusOne();
        return new ParkingResult("car already parking in ParkingLotB", new Ticket(car.getCarPlateName()));
    }

}
