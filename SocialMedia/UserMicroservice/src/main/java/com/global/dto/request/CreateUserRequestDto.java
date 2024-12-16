package com.global.dto.request;

import lombok.Data;

@Data
public class CreateUserRequestDto {
    Long authId;
    String username;
    String email;
}
