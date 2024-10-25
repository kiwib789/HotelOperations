package com.pluralsight.hotel.operations;

public class Room {
    private double numbersOfBeds;
    private double price;
    private boolean dirty;
    private boolean isAvailable;
    private boolean isOccupied;

    public Room(double numbersOfBeds, double price, boolean dirty, boolean isAvailable, boolean isOccupied) {
        this.numbersOfBeds = numbersOfBeds;
        this.price = price;
        this.dirty = dirty;
        this.isAvailable = isAvailable;
        this.isOccupied = isOccupied;
    }

    public double getNumbersOfBeds() {
        return numbersOfBeds;
    }

    public void setNumbersOfBeds(double numbersOfBeds) {
        this.numbersOfBeds = numbersOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    @Override
    public String toString() {
        return "Room{" +
                "numbersOfBeds=" + numbersOfBeds +
                ", price=" + price +
                ", dirty=" + dirty +
                ", isAvailable=" + isAvailable +
                ", isOccupied=" + isOccupied +
                '}';
    }
}
