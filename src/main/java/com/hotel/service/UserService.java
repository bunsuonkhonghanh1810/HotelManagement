package com.hotel.service;

import com.hotel.model.User;
import com.hotel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean emailExists(String email) {
        return userRepository.findByEmail(email).isPresent();
    }

    public User registerUser(String firstName, String lastName, String email, String password) {
        if (emailExists(email)) {
            throw new IllegalArgumentException("Email đã được sử dụng");
        }
        User user = new User(firstName, lastName, email, password);
        return userRepository.save(user);
    }
}