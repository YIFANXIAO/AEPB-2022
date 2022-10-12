package com.example.aepb;

import com.example.aepb.entity.Car;
import com.example.aepb.entity.ParkingLot;
import com.example.aepb.entity.ParkingResult;
import com.example.aepb.entity.SmartParkingBoy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertNotNull;

class SmartParkingBoyTest {

    @Test
    void should_park_car_in_parking_lot_A_when_Parking_Lot_A_remaining_space_more_than_Parking_Lot_B() {
        ParkingLot parkingLotA = new ParkingLot(2, 0.2);
        ParkingLot parkingLotB = new ParkingLot(1, 0.2);
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy(parkingLotA, parkingLotB);
        Car car = new Car("京A12345");

        ParkingResult parkingResult = smartParkingBoy.parkingCar(car);

        assertEquals("car already parking in ParkingLotA", parkingResult.getMessage());
        assertNotNull("get the ticket", parkingResult.getTicket());

    }

    @Test
    void should_park_car_in_parking_lot_B_when_Parking_Lot_B_remaining_space_more_than_Parking_Lot_A() {
        ParkingLot parkingLotA = new ParkingLot(1, 0.2);
        ParkingLot parkingLotB = new ParkingLot(2, 0.2);
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy(parkingLotA, parkingLotB);
        Car car = new Car("京A12345");

        ParkingResult parkingResult = smartParkingBoy.parkingCar(car);

        assertEquals("car already parking in ParkingLotB", parkingResult.getMessage());
        assertNotNull("system error", parkingResult.getTicket());

    }

    @Test
    void should_minus_one_for_parking_lot_B_when_Parking_Lot_B_remaining_space_more_than_Parking_Lot_A() {
        ParkingLot parkingLotA = new ParkingLot(1, 0.2);
        ParkingLot parkingLotB = new ParkingLot(2, 0.2);
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy(parkingLotA, parkingLotB);
        Car car = new Car("京A12345");

        ParkingResult parkingResult = smartParkingBoy.parkingCar(car);

        assertEquals(1, parkingLotB.getRemainingCount());
    }

    @Test
    void should_parking_car_in_parking_lot_A_when_Parking_Lot_B_remaining_space_same_with_Parking_Lot_A() {
        ParkingLot parkingLotA = new ParkingLot(2, 0.2);
        ParkingLot parkingLotB = new ParkingLot(2, 0.2);
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy(parkingLotA, parkingLotB);
        Car car = new Car("京A12345");

        ParkingResult parkingResult = smartParkingBoy.parkingCar(car);

        assertEquals("car already parking in ParkingLotA", parkingResult.getMessage());
        assertNotNull("system error", parkingResult.getTicket());
        assertEquals(1, parkingLotA.getRemainingCount());
    }

    @Test
    void should_get_ticket_for_carA_when_Parking_CarA() {
        ParkingLot parkingLotA = new ParkingLot(1, 0.2);
        ParkingLot parkingLotB = new ParkingLot(2, 0.2);
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy(parkingLotA, parkingLotB);
        Car carA = new Car("京A12345");

        ParkingResult parkingResult = smartParkingBoy.parkingCar(carA);

        assertEquals("京A12345", parkingResult.getTicket().getAssociatedCarPlateNumber());
    }

}
