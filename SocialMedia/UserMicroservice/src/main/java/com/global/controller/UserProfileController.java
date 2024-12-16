package com.global.controller;

import com.global.document.UserProfile;
import com.global.dto.request.CreateUserRequestDto;
import com.global.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import static com.global.config.RestApis.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(USERPROFILE)
public class UserProfileController {
    private final UserProfileService userProfileService;

    @PostMapping(CREATE_USER)
    public ResponseEntity<Boolean> createUser(@RequestBody CreateUserRequestDto dto){
        userProfileService.createUser(dto);
        return ResponseEntity.ok(true);
    }

    @GetMapping(GET_ALL)
    public ResponseEntity<List<UserProfile>> getAll(){
        return ResponseEntity.ok(userProfileService.getAll());
    }

    @GetMapping("/upper-name")
    public ResponseEntity<String> upperName(String name){
        return ResponseEntity.ok(userProfileService.upperName(name));
    }
}