package com.global.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserRequestDto {
    Long authId;
    String username;
    String email;
}
