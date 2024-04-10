package com.hamidul.firstProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hamidul.firstProject.Entity.Bookings;
import com.hamidul.firstProject.Service.BookingsService;

@RestController
@RequestMapping("/Bookings")
public class BookingsController {

    @Autowired
    private BookingsService bookingsService;

    // Get all Bookings
    @GetMapping("/")
    public List<Bookings> getAllBookings() {
        return bookingsService.getAllBookings();
    }

    // Get a booking by ID
    @GetMapping("/{id}")
    public Bookings getBookingById(@PathVariable Long id) {
        return bookingsService.getBookingById(id);
    }

    // Create a new booking
    @PostMapping("/")
    public Bookings createBooking(@RequestBody Bookings booking) {
        return bookingsService.createBooking(booking);
    }

    // Update an existing booking
    @PutMapping("/{id}")
    public Bookings updateBooking(@PathVariable Long id, @RequestBody Bookings booking) {
        return bookingsService.updateBooking(id, booking);
    }

    // Delete a booking by ID
    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable Long id) {
        bookingsService.deleteBooking(id);
    }
}
