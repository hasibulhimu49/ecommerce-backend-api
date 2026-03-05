package com.example.ecommerce_backend.product.dto.update;

public record InventoryUpdateRequestDto(


        Long productId,
        Integer quantityAvailable
) {
}
