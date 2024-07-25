package com.pakskiy.usermanagement.service.impl;

import com.pakskiy.usermanagement.dto.UserRequestDto;
import com.pakskiy.usermanagement.dto.UserResponseDto;
import com.pakskiy.usermanagement.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public Mono<UserResponseDto> create(UserRequestDto request) {
        return null;
    }

    @Override
    public Mono<UserResponseDto> update(UserRequestDto request) {
        return null;
    }

    @Override
    public Mono<UserResponseDto> get(Long id) {
        return null;
    }
}
