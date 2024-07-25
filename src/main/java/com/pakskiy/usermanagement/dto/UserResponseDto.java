package com.pakskiy.usermanagement.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponseDto {
    private Long id;
    private String secretKey;
    private String status;
    private String firstName;
    private String lastName;
}
