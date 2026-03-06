package com.example.ecommerce_backend.cart.controller;

import com.example.ecommerce_backend.cart.dto.request.AddToCartRequestDto;
import com.example.ecommerce_backend.cart.dto.request.CartItemRequestDto;
import com.example.ecommerce_backend.cart.dto.response.CartResponseDto;
import com.example.ecommerce_backend.cart.service.impl.CartService;
import com.example.ecommerce_backend.common.constants.ApiEndpoints;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(ApiEndpoints.Cart.BASE_CART)
public class CartController {

    private final CartService cartService;


    // Add product to cart
    @PostMapping("/{userId}/items")
    public CartResponseDto addToCart(
            @PathVariable Long userId,
            @RequestBody AddToCartRequestDto request
    ) {
        return cartService.addToCart(userId, request);
    }


    // Get cart
    @GetMapping
    public CartResponseDto getCart() {
        return cartService.getCart();
    }


    // Add item (alternative)
    @PostMapping("/items")
    public CartResponseDto addItemToCart(
            @RequestBody CartItemRequestDto requestDto
    ) {
        return cartService.addItemToCart(requestDto);
    }


    // Update quantity
    @PutMapping("/items")
    public CartResponseDto updateItemQuantity(
            @RequestBody CartItemRequestDto requestDto
    ) {
        return cartService.updateItemQuantity(requestDto);
    }


    // Remove item
    @DeleteMapping("/items/{cartItemId}")
    public CartResponseDto removeItemFromCart(
            @PathVariable Long cartItemId
    ) {
        return cartService.removeItemFromCart(cartItemId);
    }

}