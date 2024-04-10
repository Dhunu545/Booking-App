package com.hamidul.firstProject.Service;

import java.util.List;

import com.hamidul.firstProject.Entity.Bookings;

public interface BookingsService {

    List<Bookings> getAllBookings();
    Bookings getBookingById(long id);
    Bookings createBooking(Bookings booking);
    Bookings updateBooking(long id, Bookings updatedBooking); 
    void deleteBooking(long id);
}
