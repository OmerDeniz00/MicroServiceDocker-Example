package com.global.dto.request;

import lombok.Data;

@Data
public class RegisterRequestDto {
    String username;
    String password;
    String repassword;
    String email;
}
