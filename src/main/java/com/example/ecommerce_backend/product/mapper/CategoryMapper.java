package com.example.ecommerce_backend.product.mapper;

import com.example.ecommerce_backend.product.dto.request.CategoryCreateRequestDto;
import com.example.ecommerce_backend.product.dto.response.CategoryResponseDto;
import com.example.ecommerce_backend.product.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface CategoryMapper {

    Category toEntity(CategoryCreateRequestDto requestDto);

    CategoryResponseDto toDto(Category category);


}
