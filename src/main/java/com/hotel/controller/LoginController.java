package com.hotel.controller;

import com.hotel.model.User;
import com.hotel.repository.UserRepository;
import com.hotel.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/home_guest")
    public String home_guest(HttpSession session) {
        if (session.getAttribute("roll") == "admin") {
            session.invalidate();

            return "guest/home_guest";
        }

        return "guest/home_guest";
    }

    @GetMapping("/sign_in")
    public String sign_in(HttpSession session) {
        session.invalidate();
        return "guest/sign_in";
    }
//    @GetMapping("/home_guest/room_booking")
//    public String homeGuestRoomBooking() {
//        return "guest/room_booking";
//    }
    @GetMapping("/sign_up")
    public String sign_up() {return "guest/sign_up";}

    @PostMapping("/sign_in")
    public String sign_in(@RequestParam("email") String email,
                          @RequestParam("password") String password,
                          HttpSession session) {
        Optional<User> optionalUser = userRepository.findByEmail(email);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            if (UserService.verifyPassword(password, user.getPassword())) {
                session.setAttribute("role", user.getRole());
                session.setAttribute("userName", user.getFirstName() + " " + user.getLastName());

                return "redirect:/home_guest";
            }
        }

        session.setAttribute("signInError", "Sai tài khoản hoặc mật khẩu");
        return "redirect:/sign_in";
    }


    @PostMapping("/sign_up")
    public String sign_up(@RequestParam("firstName") String firstName,
                          @RequestParam("lastName") String lastName,
                          @RequestParam("email") String email,
                          @RequestParam("password") String password,
                          HttpSession session) {
        try {
            userService.registerUser(firstName, lastName, email, UserService.encryptPassword(password), "user");

            return "redirect:/sign_in";
        } catch (IllegalArgumentException e) {
            session.setAttribute("signUpError", e.getMessage());

            return "redirect:/sign_up";
        }
    }

    @GetMapping("/login")
    public String login(HttpSession session) {
        return "staff/login";
    }

    @GetMapping("/home_admin")
    public String home_admin(HttpSession session) {
        if ("admin".equals(session.getAttribute("role"))) {
            return "staff/home";
        }

        return "redirect:/login";
    }

    @PostMapping("/login")
    public String login (@RequestParam("email") String email,
                          @RequestParam("password") String password,
                          HttpSession session) {
        Optional<User> optionalUser = userRepository.findByEmail(email);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            if (UserService.verifyPassword(password, user.getPassword())) {
                session.setAttribute("role", user.getRole());
                System.out.println(session.getAttribute("role"));
                session.setAttribute("userName", user.getEmail());

                return "redirect:/home_admin";
            }
        }

        session.setAttribute("signInError", "Sai tài khoản hoặc mật khẩu");
        return "redirect:/login";
    }
}
