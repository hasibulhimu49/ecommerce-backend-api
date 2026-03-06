package com.example.ecommerce_backend.cart.mapper;

import com.example.ecommerce_backend.cart.dto.response.CartItemResponseDto;
import com.example.ecommerce_backend.cart.entity.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartItemMapper {

    @Mapping(source = "product.id", target = "productId")
    @Mapping(source = "product.name", target = "productName")
    CartItemResponseDto toDto(CartItem cartItem);

}
