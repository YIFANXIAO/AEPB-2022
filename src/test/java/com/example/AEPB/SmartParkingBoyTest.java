package com.example.AEPB;

import com.example.AEPB.entity.Car;
import com.example.AEPB.entity.ParkingLot;
import com.example.AEPB.entity.ParkingResult;
import com.example.AEPB.entity.SmartParkingBoy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertNotNull;

class SmartParkingBoyTest {

    @Test
    void should_park_car_in_parking_lot_A_when_Parking_Lot_A_remaining_space_more_than_Parking_Lot_B() {
        ParkingLot parkingLotA = new ParkingLot(10);
        ParkingLot parkingLotB = new ParkingLot(5);
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy(parkingLotA, parkingLotB);
        Car car = new Car("京A12345");

        ParkingResult parkingResult = smartParkingBoy.parkingCar(car);

        assertEquals("car already parking in ParkingLotA", parkingResult.getMessage());
        assertNotNull("get the ticket", parkingResult.getTicket());

    }

}
