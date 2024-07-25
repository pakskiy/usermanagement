package com.pakskiy.usermanagement.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class AddressRequestDto {
    @JsonProperty("secret_key")
    private String secretKey;
    private Date created;
    private Date updated;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("verified_at")
    private Date verifiedAt;
    @JsonProperty("archived_at")
    private Date archivedAt;
    private String status;
    private boolean filled;
    @JsonProperty("address_id")
    private String addressId;
    @JsonProperty("countryId")
    private int country_id;
    private String address;
    @JsonProperty("zip_code")
    private String zipCode;
    private Date archived;
    private String city;
    private String state;
}