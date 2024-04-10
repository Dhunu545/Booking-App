package com.hamidul.firstProject.Entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers", schema = "public")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "phone_number")
    private Long phoneNumber;

    @Column(name = "date_time")
    private Timestamp dateTime;

    @Column(name = "advance_paid")
    private int advancePaid;

    // Constructors, getters, and setters

    public Customer() {
    }
    

    public Customer(Long customerId, String customerName, Long phoneNumber, Timestamp dateTime,
            int advancePaid) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.dateTime = dateTime;
        this.advancePaid = advancePaid;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateTime() {
        return getDateTime().toString();
    }

    public void setDateTime(String dateTime) {
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.dateTime = Timestamp.valueOf(localDateTime);
    }

    public int getAdvancePaid() {
        return advancePaid;
    }

    public void setAdvancePaid(int advancePaid) {
        this.advancePaid = advancePaid;
    }
    
}
