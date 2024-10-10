package com.hotel.controller;

import com.hotel.model.Room;
import com.hotel.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;

    @GetMapping("/rooms")
    public String listRooms(Model model) {
        model.addAttribute("rooms", roomRepository.findAll());
        return "room-list"; // trả về trang hiển thị danh sách phòng
    }

    @GetMapping("/rooms/new")
    public String newRoomForm() {
        return "new-room"; // trả về trang nhập dữ liệu phòng mới
    }

    @PostMapping("/rooms")
    public String createRoom(@RequestParam String name, @RequestParam String booked_date, @RequestParam String expired_date, @RequestParam String status) {
        Room room = new Room(name, booked_date, expired_date, status);
        roomRepository.save(room);
        return "redirect:/rooms";
    }
}
