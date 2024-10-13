package com.hotel.controller;

import com.hotel.model.User;
import com.hotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;
    @Autowired
    private DefaultErrorAttributes errorAttributes;

    @GetMapping("/login")
    public String login() {
        return "staff/login";
    }

    @GetMapping("/")
    public String redirectToHome() {
        return "redirect:/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model) {
        User user = userService.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return "redirect:/home";
        } else {
            model.addAttribute("error", "Sai tài khoản hoặc mật khẩu");
            return "staff/login";
        }
    }
}
