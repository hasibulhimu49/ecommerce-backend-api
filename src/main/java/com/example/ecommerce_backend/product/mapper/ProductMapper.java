package com.example.ecommerce_backend.product.mapper;

import com.example.ecommerce_backend.product.dto.request.ProductCreateRequestDto;
import com.example.ecommerce_backend.product.dto.response.ProductResponseDto;
import com.example.ecommerce_backend.product.entity.Category;
import com.example.ecommerce_backend.product.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ProductMapper { //Mapstruct er jonnop interface, r manually korle class use kortam

   // @Mapping(target = "category",source = "category")
    Product toEntity(ProductCreateRequestDto dto);

    ProductResponseDto toDto(Product product);
}
