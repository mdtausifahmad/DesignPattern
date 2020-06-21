package com.pattern.creational.factorymethod;

public class SalesExecutive extends  Employee{

    @Override
    public void getReadyForTravel() {
        _filght = new FirstClassFlightBooking();
        _hotel = new FiveStarHotelReservation();
        _car = new FirstClassCarRental();
    }
}
