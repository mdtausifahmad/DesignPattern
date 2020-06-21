package com.pattern.creational.factorymethod;

public abstract class Employee {
    private HotelReservation _hotel;
    private FlightBooking _filght;
    private CarRental _car;


    public void getReadyForTravel() {
        _filght = bookFlight();
        _hotel = bookHotel();
        _car = bookCar();
    }

    protected abstract CarRental bookCar();

    protected abstract HotelReservation bookHotel();

    protected abstract FlightBooking bookFlight();


    @Override
    public String toString() {
        return String.format("%s %s %s %s", getClass(), _filght, _hotel, _car);
    }
}
