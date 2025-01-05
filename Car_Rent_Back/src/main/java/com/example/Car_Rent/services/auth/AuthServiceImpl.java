package com.example.Car_Rent.services.auth;

import com.example.Car_Rent.dto.SignupRequest;
import com.example.Car_Rent.dto.UserDto;
import com.example.Car_Rent.entity.User;
import com.example.Car_Rent.enums.UserRole;
import com.example.Car_Rent.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    @Override
    public UserDto createCustomer(SignupRequest signupRequest) {
        User user = new User();
        user.setName(signupRequest.getName());
        user.setEmail(signupRequest.getEmail());
        user.setPassword(signupRequest.getPassword());
        user.setUserRole(UserRole.CUSTOMER);
        User createdUser =userRepository.save(user);
        UserDto userDto = new UserDto();
        userDto.setId(createdUser.getId());
        return userDto;
    }
}
