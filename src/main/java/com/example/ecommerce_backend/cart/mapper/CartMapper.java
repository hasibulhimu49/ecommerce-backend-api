package com.example.ecommerce_backend.cart.mapper;

import com.example.ecommerce_backend.cart.dto.response.CartResponseDto;
import com.example.ecommerce_backend.cart.entity.Cart;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = CartItemMapper.class)
public interface CartMapper {

    @Mapping(source = "user.id", target = "userId")
    //@Mapping(source = "totalPrice", target = "totalPrice")
    CartResponseDto toDto(Cart cart);

}
