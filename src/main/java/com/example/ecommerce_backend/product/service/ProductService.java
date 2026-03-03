package com.example.ecommerce_backend.product.service;

import com.example.ecommerce_backend.product.dto.request.ProductCreateRequestDto;
import com.example.ecommerce_backend.product.dto.response.ProductResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    ProductResponseDto createProduct(ProductCreateRequestDto requestDto);
    ProductResponseDto getProductById(Long id);
}
