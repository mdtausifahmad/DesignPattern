package com.pattern.creational.factorymethod;

public class SalesExecutive extends  Employee{

    @Override
    protected CarRental bookCar() {
        return new FirstClassCarRental();
    }

    @Override
    protected HotelReservation bookHotel() {
        return new FiveStarHotelReservation();
    }

    @Override
    protected FlightBooking bookFlight() {
        return new FirstClassFlightBooking();
    }
}
