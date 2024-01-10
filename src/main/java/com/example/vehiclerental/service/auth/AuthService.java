package com.example.vehiclerental.service.auth;

import com.example.vehiclerental.dto.SignupRequest;
import com.example.vehiclerental.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service

public interface AuthService {
    UserDto createCustomer(SignupRequest signupRequest);

    boolean hasCustomerWithEmail(String email);
}
