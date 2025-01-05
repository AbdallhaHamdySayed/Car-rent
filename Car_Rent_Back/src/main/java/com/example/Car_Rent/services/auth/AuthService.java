package com.example.Car_Rent.services.auth;

import com.example.Car_Rent.dto.SignupRequest;
import com.example.Car_Rent.dto.UserDto;

public interface AuthService {

    UserDto createCustomer(SignupRequest signupRequest);

    boolean hasCustomerWithEmail(String email);
}
