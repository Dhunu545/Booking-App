package com.hamidul.firstProject.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamidul.firstProject.Entity.Bookings;
import com.hamidul.firstProject.Repository.BookingsRepository;
import com.hamidul.firstProject.Service.BookingsService;

@Service
public class BookingsServiceImpl implements BookingsService {

    @Autowired
    private BookingsRepository bookingsRepository;

    @Override
    public List<Bookings> getAllBookings() {
        
        return bookingsRepository.findAll();
    }

    @Override
    public Bookings getBookingById(long id) {
        Optional<Bookings> optionalBooking = bookingsRepository.findById(id);
        return optionalBooking.orElse(null);
    }

    @Override
    public Bookings createBooking(Bookings booking) {
        return bookingsRepository.save(booking);
    }

    @Override
    public Bookings updateBooking(long id, Bookings updatedBooking) {
        Optional<Bookings> optionalBooking = bookingsRepository.findById(id);
        if (optionalBooking.isPresent()) {
            return bookingsRepository.save(updatedBooking);
        }
        return null;
    }

    @Override
    public void deleteBooking(long id) {
        bookingsRepository.deleteById(id);
    }
    
}
