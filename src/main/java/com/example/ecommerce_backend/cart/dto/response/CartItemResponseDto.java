package com.example.ecommerce_backend.cart.dto.response;

public record CartItemResponseDto(
        Long id,
        Long productId,
        String productName,
        Integer quantity,
        Double unitPrice,
        Double priceAtAddition
) {}
