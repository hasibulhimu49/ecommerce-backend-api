package com.example.ecommerce_backend.product.service.impl;

import com.example.ecommerce_backend.product.dto.request.CategoryCreateRequestDto;
import com.example.ecommerce_backend.product.dto.response.CategoryResponseDto;
import com.example.ecommerce_backend.product.entity.Category;
import com.example.ecommerce_backend.product.mapper.CategoryMapper;
import com.example.ecommerce_backend.product.repository.CategoryRepository;
import com.example.ecommerce_backend.product.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repository;
    private final CategoryMapper mapper;



    @Override
    public CategoryResponseDto createCategory(CategoryCreateRequestDto requestDto) {
        Category category= mapper.toEntity(requestDto);
        Category savedCategory=repository.save(category);
        return mapper.toDto(savedCategory);
    }
}
