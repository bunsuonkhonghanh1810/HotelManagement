// src/main/java/com/hotel/controller/RoomController.java
package com.hotel.controller;

import com.hotel.model.Guest;
import com.hotel.model.Room;
import com.hotel.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class RoomController {

    private final RoomRepository roomRepository;

    @Autowired
    public RoomController(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @GetMapping("/get-rooms")
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    @PostMapping("/update-room-status")
    public ResponseEntity<String> updateRoomStatus(@RequestParam String roomNumber, @RequestParam String status) {
        Room room = roomRepository.findByRoomNumber(roomNumber);

        if (status.equals("Đã thuê")) {
            room.setStatus(status);
            roomRepository.save(room);
        } else {
            room.setStatus(status);
            room.setCustomerName(null);
            room.setCustomerPhone(null);
            room.setCheckInTime(null);
            room.setCheckOutTime(null);
            room.setRoomFee(null);
            room.setServices(null);
            room.setServiceFee(BigDecimal.valueOf(0.0));
            room.setTotalFee(null);
            roomRepository.save(room);
        }
        
        return ResponseEntity.ok("Cập nhật trạng thái thành công");
    }
}
