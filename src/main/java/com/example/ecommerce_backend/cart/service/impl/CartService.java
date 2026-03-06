package com.example.ecommerce_backend.cart.service.impl;


import com.example.ecommerce_backend.cart.dto.request.AddToCartRequestDto;
import com.example.ecommerce_backend.cart.dto.request.CartItemRequestDto;
import com.example.ecommerce_backend.cart.dto.response.CartResponseDto;

public interface CartService {

    CartResponseDto addToCart(Long userId, AddToCartRequestDto request);



    CartResponseDto getCart();

    CartResponseDto addItemToCart(CartItemRequestDto requestDto);

    CartResponseDto updateItemQuantity(CartItemRequestDto requestDto);

    CartResponseDto removeItemFromCart(Long cartItemId);
}