package com.vibecode.ecommerce.dto;

public record CustomerProfileResponse(
        Long customerId,
        String fullName,
        String email,
        boolean premium
) {
}
