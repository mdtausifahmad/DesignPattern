package com.pattern.creational.factorymethod;

public class Developer extends Employee {

    @Override
    protected CarRental bookCar() {
        return new EconomyCarRental();
    }

    @Override
    protected HotelReservation bookHotel() {
        return new ThreeStarHotelReservation();
    }

    @Override
    protected FlightBooking bookFlight() {
        return new EconomyFlightBooking();
    }
}
