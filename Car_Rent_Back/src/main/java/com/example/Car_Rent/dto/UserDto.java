package com.example.Car_Rent.dto;

import com.example.Car_Rent.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;

    private String name;

    private String email;

    private UserRole role;

}
