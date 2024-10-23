package com.pluralsight.hotel.operations;

public class Room {
    double numbersOfBeds;
    double price;
    boolean dirty;

    public Room(double numbersOfBeds, double price, boolean dirty, boolean occupied, boolean available) {
        this.numbersOfBeds = numbersOfBeds;
        this.price = price;
        this.dirty = dirty;
        this.occupied = occupied;
        this.available = available;
    }

    public double getNumbersOfBeds() {
        return numbersOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isAvailable() {
        return available;
    }

    boolean occupied;
    boolean available;


}
