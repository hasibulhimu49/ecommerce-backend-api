package com.example.ecommerce_backend.cart.dto.response;

import java.util.List;

public record CartResponseDto(
        Long id,
        Long userId,
        Double totalPrice,
        List<CartItemResponseDto> items
) {}