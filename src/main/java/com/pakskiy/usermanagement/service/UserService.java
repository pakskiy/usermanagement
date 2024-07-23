package com.pakskiy.usermanagement.service;

import com.pakskiy.usermanagement.dto.UserRequestDto;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<UserResponseDto> create(UserRequestDto request);
}
