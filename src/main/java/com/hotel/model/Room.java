package com.hotel.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Room {
    @Id
    private int id;
    private String roomNumber;
    private String roomType;
    private String status;
    private String customerName;
    private String customerPhone;
    private String checkInTime;
    private String checkOutTime;
    private BigDecimal roomFee;
    private BigDecimal dailyPrice;
    private String services;
    private BigDecimal serviceFee;
    private BigDecimal totalFee;
    private String imagePath;

    public Room() {}

    public Room(int id, String roomNumber, String roomType, String status, String customerName, String customerPhone, String checkInTime, String checkOutTime, BigDecimal roomFee, BigDecimal dailyPrice, String services, BigDecimal serviceFee, BigDecimal totalFee, String imagePath) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.status = status;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.roomFee = roomFee;
        this.dailyPrice = dailyPrice;
        this.services = services;
        this.serviceFee = serviceFee;
        this.totalFee = totalFee;
        this.imagePath = imagePath;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public BigDecimal getRoomFee() {
        return roomFee;
    }

    public void setRoomFee(BigDecimal roomFee) {
        this.roomFee = roomFee;
    }

    public BigDecimal getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(BigDecimal dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
