package com.example.ecommerce_backend.product.service;

import com.example.ecommerce_backend.product.dto.request.CategoryCreateRequestDto;
import com.example.ecommerce_backend.product.dto.response.CategoryResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {

    CategoryResponseDto createCategory(CategoryCreateRequestDto requestDto);
}
