package com.smartshift.smartshift_backend.service.impl;

import com.smartshift.smartshift_backend.dto.LoginRequestDTO;
import com.smartshift.smartshift_backend.dto.LoginResponseDTO;
import com.smartshift.smartshift_backend.entity.User;
import com.smartshift.smartshift_backend.repository.UserRepository;
import com.smartshift.smartshift_backend.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public LoginResponseDTO login(LoginRequestDTO request) {
        User user = userRepository.findByUsername(request.getUsername())
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.UNAUTHORIZED, "Invalid username or password"
                ));

        if (!user.getPassword().equals(request.getPassword())) {
            throw new ResponseStatusException(
                    HttpStatus.UNAUTHORIZED, "Invalid username or password"
            );
        }

        return new LoginResponseDTO(
                user.getId(),
                user.getUsername(),
                user.getRole(),
                "Login successful"
        );
    }
}