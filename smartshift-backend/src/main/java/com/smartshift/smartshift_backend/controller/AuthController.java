package com.smartshift.smartshift_backend.controller;

import com.smartshift.smartshift_backend.dto.LoginRequestDTO;
import com.smartshift.smartshift_backend.dto.LoginResponseDTO;
import com.smartshift.smartshift_backend.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public LoginResponseDTO login(@RequestBody LoginRequestDTO request) {
        return authService.login(request);
    }

}
