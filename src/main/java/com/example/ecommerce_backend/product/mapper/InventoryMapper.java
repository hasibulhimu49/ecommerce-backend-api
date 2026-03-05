package com.example.ecommerce_backend.product.mapper;

import com.example.ecommerce_backend.product.dto.request.InventoryCreateRequestDto;
import com.example.ecommerce_backend.product.dto.response.InventoryResponseDto;
import com.example.ecommerce_backend.product.dto.update.InventoryUpdateRequestDto;
import com.example.ecommerce_backend.product.entity.Inventory;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface InventoryMapper {

    @Mapping(source = "productId", target = "product.id")
    Inventory toEntity(InventoryCreateRequestDto createDto);

    @Mapping(source = "product.id", target = "productId")
    InventoryResponseDto toDto(Inventory request);
}
