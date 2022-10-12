package com.example.aepb.entity;

import com.example.aepb.service.parkingCar;

public class ParkingRobot implements parkingCar {

    private ParkingLot parkingLotA;

    private ParkingLot parkingLotB;

    public ParkingRobot(ParkingLot parkingLotA, ParkingLot parkingLotB) {
        this.parkingLotA = parkingLotA;
        this.parkingLotB = parkingLotB;
    }

    @Override
    public ParkingResult parkingCar(Car car) {
        if(parkingLotA.getRemainingCount() >= parkingLotB.getRemainingCount()) {
            parkingLotA.parkingSpacesMinusOne();
            return new ParkingResult("car already parking in ParkingLotA", new Ticket(car.getCarPlateName()));
        }

        parkingLotB.parkingSpacesMinusOne();
        return new ParkingResult("car already parking in ParkingLotB", new Ticket(car.getCarPlateName()));
    }

}
