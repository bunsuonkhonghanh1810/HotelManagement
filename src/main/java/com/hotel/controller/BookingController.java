package com.hotel.controller;

import com.hotel.model.Room;
import com.hotel.repository.RoomRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BookingController {

    @Autowired
    private RoomRepository roomRepository;

    @GetMapping("/room_booking")
    public String homeGuestRoomBooking() {
        return "guest/room_booking";
    }
}
