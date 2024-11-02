package com.hotel.controller;

import com.hotel.model.Guest;
import com.hotel.model.Room;
import com.hotel.repository.GuestRepository;
import com.hotel.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class GuestController {

    @Autowired
    private GuestRepository guestRepository;

    @Autowired
    private RoomRepository roomRepository;

    @PostMapping("/add_guest")
    public ResponseEntity<String> createRoom(@RequestParam String guestName,
                                             @RequestParam String guestPhone,
                                             @RequestParam String guestEmailAddress,
                                             @RequestParam String roomType,
                                             @RequestParam String checkInDate,
                                             @RequestParam String checkOutDate,
                                             @RequestParam String roomNumber,
                                             @RequestParam BigDecimal dailyPrice,
                                             @RequestParam BigDecimal roomFee,
                                             @RequestParam String requestTime,
                                             @RequestParam String status) {

        Guest guest = new Guest(guestName, guestPhone, guestEmailAddress, roomType, checkInDate, checkOutDate, roomNumber, dailyPrice, roomFee, requestTime, status);
        guestRepository.save(guest);

        Room room = roomRepository.findByRoomNumber(roomNumber);
        room.setStatus("Đã đặt");
        room.setCustomerName(guestName);
        room.setCustomerPhone(guestPhone);
        room.setCheckInTime(checkInDate);
        room.setCheckOutTime(checkOutDate);
        room.setRoomFee(roomFee);
        room.setTotalFee(roomFee);
        roomRepository.save(room);

        return ResponseEntity.ok("success");
    }

    @GetMapping("/get-guests")
    public List<Guest> getAllGuests() {
        return guestRepository.findAll();
    }

    @PostMapping("/update-guest-status")
    public ResponseEntity<String> updateGuestStatus(@RequestParam Long guestId, @RequestParam String status) {
        Guest guest = guestRepository.findById(guestId).orElse(null);

        guest.setStatus(status);
        guestRepository.save(guest);

        return ResponseEntity.ok("Cập nhật trạng thái thành công");
    }
}