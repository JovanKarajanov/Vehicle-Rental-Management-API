package com.example.vehiclerental.dto;

import com.example.vehiclerental.enums.UserRole;
import lombok.Data;

@Data
public class AuthenticationResponse {
    private String jwt;
    private UserRole userRole;
    private Long userId;
}
