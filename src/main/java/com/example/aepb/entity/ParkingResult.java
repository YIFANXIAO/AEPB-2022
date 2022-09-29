package com.example.aepb.entity;

public class ParkingResult {

    private String message;

    private Ticket ticket;

    public String getMessage() {
        return message;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ParkingResult(String message, Ticket ticket) {
        this.message = message;
        this.ticket = ticket;
    }
}
