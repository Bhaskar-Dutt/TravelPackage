package com.nymble.travelPackage.model;

public class Activity {
    // Attributes and methods
    private StringBuilder name;
    private StringBuilder description;
    private double cost;
    private int capacity;
    private boolean isFull;

    public Activity(StringBuilder name, StringBuilder description, double cost, int capacity) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.isFull = false;
    }

    public StringBuilder getName() {
        return name;
    }

    public StringBuilder getDescription() {
        return description;
    }

    public int getCapacity(){
        return capacity;
    }

    public double getCost() {
        return cost;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }
}
