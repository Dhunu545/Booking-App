package com.hamidul.firstProject.Entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.persistence.*;


@Entity
@Table(name = "Bookings", schema = "public")
public class Bookings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookingId;

    @Column(name = "car_name")
    private String carName;

    // @ManyToOne
    // @JoinColumn(name = "car_number", referencedColumnName = "car_number", insertable = false, updatable = false)
    // private Cars cars;

    @Column(name = "car_number")
    private String carNumber;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "airport_pickup")
    private Timestamp airportPickup;

    @Column(name = "airport_drop")
    private Timestamp airportDrop;

    @Column(name = "total_bill")
    private int totalBill;

    @Column(name = "advance_paid")
    private int advancedPaid;

    public Bookings() {
    }

    public Bookings(String carName, String carNumber, int customerId, Timestamp airportPickup, Timestamp airportDrop, int totalBill,
            int advancedPaid) {
        this.carName = carName;
        this.carNumber = carNumber;
        this.customerId = customerId;
        this.airportPickup = airportPickup;
        this.airportDrop = airportDrop;
        this.totalBill = totalBill;
        this.advancedPaid = advancedPaid;
    }

    public long getBookingId() {
        return bookingId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getAirportPickup() {
        return airportPickup.toString();
    }

    public void setAirportPickup(String airportPickup) {
        LocalDateTime localDateTime = LocalDateTime.parse(airportPickup, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.airportPickup = Timestamp.valueOf(localDateTime);
    }

    public String getAirportDrop() {
        return airportDrop.toString();
    }

    public void setAirportDrop(String airportDrop) {
        LocalDateTime localDateTime = LocalDateTime.parse(airportDrop, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.airportDrop = Timestamp.valueOf(localDateTime);
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

    public int getAdvancedPaid() {
        return advancedPaid;
    }

    public void setAdvancedPaid(int advancedPaid) {
        this.advancedPaid = advancedPaid;
    }

}
