package com.pakskiy.usermanagement.service;

import com.pakskiy.usermanagement.dto.UserRequestDto;
import com.pakskiy.usermanagement.dto.UserResponseDto;
import reactor.core.publisher.Mono;

public interface AddressService {
    Mono<UserResponseDto> create(UserRequestDto request);
    Mono<UserResponseDto> update(UserRequestDto request);
    Mono<UserResponseDto> get(Long id);
}
