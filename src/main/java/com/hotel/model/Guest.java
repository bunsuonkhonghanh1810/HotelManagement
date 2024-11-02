package com.hotel.model;

import jakarta.persistence.*;

import java.awt.*;
import java.math.BigDecimal;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String guestName;
    private String guestPhone;
    private String guestEmailAddress;
    private String roomType;
    private String checkInDate;
    private String checkOutDate;
    private String roomNumber;
    private BigDecimal dailyPrice;
    private BigDecimal roomFee;
    private String requestTime;
    private String status;

    public Guest() {}

    public Guest(String guestName, String guestPhone, String guestEmailAddress, String roomType, String checkInDate, String checkOutDate, String roomNumber, BigDecimal dailyPrice, BigDecimal roomFee, String requestTime, String status) {
        this.guestName = guestName;
        this.guestPhone = guestPhone;
        this.guestEmailAddress = guestEmailAddress;
        this.roomType = roomType;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomNumber = roomNumber;
        this.dailyPrice = dailyPrice;
        this.roomFee = roomFee;
        this.requestTime = requestTime;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestPhone() {
        return guestPhone;
    }

    public void setGuestPhone(String guestPhone) {
        this.guestPhone = guestPhone;
    }

    public String getGuestEmailAddress() {
        return guestEmailAddress;
    }

    public void setGuestEmailAddress(String guestEmailAddress) {
        this.guestEmailAddress = guestEmailAddress;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public BigDecimal getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(BigDecimal dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public BigDecimal getRoomFee() {
        return roomFee;
    }

    public void setRoomFee(BigDecimal roomFee) {
        this.roomFee = roomFee;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
