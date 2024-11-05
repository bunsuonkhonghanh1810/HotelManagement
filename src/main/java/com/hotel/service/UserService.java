package com.hotel.service;

import com.hotel.model.User;
import com.hotel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLOutput;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean emailExists(String email) {
        return userRepository.findByEmail(email).isPresent();
    }

    public User registerUser(String firstName, String lastName, String email, String password, String role) {
        if (emailExists(email)) {
            throw new IllegalArgumentException("Email đã được sử dụng");
        }
        User user = new User(firstName, lastName, email, password, role);
        return userRepository.save(user);
    }

    public static String encryptPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedPasswordBytes = md.digest(password.getBytes());

            StringBuilder sb = new StringBuilder();
            for (byte b : hashedPasswordBytes) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean verifyPassword(String inputPassword, String storedHashedPassword) {
        String hashedInputPassword = encryptPassword(inputPassword);
        System.out.println(hashedInputPassword);
        System.out.println(storedHashedPassword);
        return hashedInputPassword.equals(storedHashedPassword);
    }
}