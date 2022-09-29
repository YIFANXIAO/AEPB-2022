package com.example.aepb.entity;

public class Ticket {

    private String associatedCarPlateNumber;

    public String getAssociatedCarPlateNumber() {
        return associatedCarPlateNumber;
    }

    public void setAssociatedCarPlateNumber(String associatedCarPlateNumber) {
        this.associatedCarPlateNumber = associatedCarPlateNumber;
    }

    public Ticket(String associatedCarPlateNumber) {
        this.associatedCarPlateNumber = associatedCarPlateNumber;
    }
}
