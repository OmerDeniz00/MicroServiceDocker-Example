package com.global.service;

import com.global.dto.request.CreateUserRequestDto;
import com.global.dto.request.LoginResponseDto;
import com.global.dto.request.RegisterRequestDto;
import com.global.entity.Auth;
import com.global.manager.UserProfileManager;
import com.global.repository.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthRepository repository;
    private final UserProfileManager userProfileManager;

    public Auth register(RegisterRequestDto dto) {
        Auth auth = repository.save(Auth.builder()
                        .userName(dto.getUsername())
                        .email(dto.getEmail())
                        .password(dto.getPassword())
                .build());
        userProfileManager.createUser(CreateUserRequestDto.builder()
                        .authId(auth.getId())
                        .email(auth.getEmail())
                        .username(auth.getUserName())
                .build());
        return auth;
    }

    public Boolean login(LoginResponseDto dto) {
        return repository.existsByUserNameAndPassword(dto.getUsername(), dto.getPassword());
    }
}
