package com.pakskiy.usermanagement.rest;

import com.pakskiy.usermanagement.dto.UserRequestDto;
import com.pakskiy.usermanagement.dto.UserResponseDto;
import com.pakskiy.usermanagement.service.UserService;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserRestControllerV1 {
    private final UserService userService;

    @PostMapping(value = "/create")
    public Mono<ResponseEntity<UserResponseDto>> create(@RequestBody UserRequestDto request) {
        return userService.create(request)
                .map(res -> (res.getErrorCode() == null ? ResponseEntity.ok(res) : ResponseEntity.badRequest().body(res)));
    }

    @PostMapping(value = "/update")
    public Mono<ResponseEntity<UserResponseDto>> update(@RequestBody UserRequestDto request) {
        return userService.update(request)
                .map(res -> (res.getErrorCode() == null ? ResponseEntity.ok(res) : ResponseEntity.badRequest().body(res)));
    }

    @GetMapping(value = "/get/{id}")
    public Mono<ResponseEntity<UserResponseDto>> get(@PathVariable Long id) {
        return userService.get(id)
                .map(res -> (res.getErrorCode() == null ? ResponseEntity.ok(res) : ResponseEntity.badRequest().body(res)));
    }
}
