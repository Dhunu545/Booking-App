package com.hamidul.firstProject.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Cars", schema = "public")
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long carId;

    @Column(name = "car_number")
    private String carNumber;

    @Column(name = "car_name")
    private String carName;

    @Column(name = "owner_name")
    private String ownerName;

    @Column(name = "owner_price")
    private double ownerPrice;

    @Column(name = "selling_price")
    private double sellingPrice;

    // Default constructor
    public Cars() {
    }

    public Cars(String carNumber, String carName, String ownerName, double ownerPrice, double sellingPrice) {
        this.carNumber = carNumber;
        this.carName = carName;
        this.ownerName = ownerName;
        this.ownerPrice = ownerPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getOwnerPrice() {
        return ownerPrice;
    }

    public void setOwnerPrice(double ownerPrice) {
        this.ownerPrice = ownerPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }
}
