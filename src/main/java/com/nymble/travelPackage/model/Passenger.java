package com.nymble.travelPackage.model;

public class Passenger {
    private StringBuilder name;
    private int passengerNumber;
    private PassengerType type;
    private double balance;

    public Passenger(StringBuilder name, int passengerNumber, PassengerType type, double balance) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.type = type;
        this.balance = balance;
    }

    public StringBuilder getName() {
        return name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public PassengerType getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Other getters and setters (omitted for brevity)
}

enum PassengerType {
    STANDARD, GOLD, PREMIUM
}
