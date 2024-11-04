package com.hotel.controller;

import com.hotel.model.User;
import com.hotel.repository.UserRepository;
import com.hotel.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class LoginController {

    private static final Logger log = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/home_guest")
    public String home_guest() {
        return "guest/home_guest";
    }

    @GetMapping("/sign_in")
    public String sign_in() {return "guest/sign_in";}

    @GetMapping("/sign_up")
    public String sign_up() {return "guest/sign_up";}

    @PostMapping("/sign_in")
    public String sign_in(@RequestParam("email") String email,
                          @RequestParam("password") String password,
                          HttpSession session) {
        System.out.println("hehe");
        Optional<User> optionalUser = userRepository.findByEmail(email);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            if (passwordEncoder.matches(password, user.getPassword())) {
                System.out.println("ngu");

                session.setAttribute("userName", user.getFirstName() + " " + user.getLastName());
                return "redirect:/home_guest";
            }
        }

        System.out.println("óc chó");
        session.setAttribute("signInError", "Sai tài khoản hoặc mật khẩu");
        return "redirect:/sign_in";
    }

    @PostMapping("/sign_up")
    public String sign_up(@RequestParam("firstName") String firstName,
                          @RequestParam("lastName") String lastName,
                          @RequestParam("email") String email,
                          @RequestParam("password") String password,
                          HttpSession session) {
        System.out.println("hihi");
        try {
            userService.registerUser(firstName, lastName, email, password);

            return "redirect:/sign_in";
        } catch (IllegalArgumentException e) {
            session.setAttribute("signUpError", e.getMessage());

            return "redirect:/sign_up";
        }
    }
}
