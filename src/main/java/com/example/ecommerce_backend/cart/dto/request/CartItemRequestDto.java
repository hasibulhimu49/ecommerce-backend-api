package com.example.ecommerce_backend.cart.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartItemRequestDto {

    private Long productId;

    private Integer quantity;

}
