package com.example.ecommerce_backend.product.service.impl;

import com.example.ecommerce_backend.product.dto.request.ProductCreateRequestDto;
import com.example.ecommerce_backend.product.dto.response.ProductResponseDto;
import com.example.ecommerce_backend.product.entity.Category;
import com.example.ecommerce_backend.product.entity.Product;
import com.example.ecommerce_backend.product.mapper.ProductMapper;
import com.example.ecommerce_backend.product.repository.CategoryRepository;
import com.example.ecommerce_backend.product.repository.ProductRepository;
import com.example.ecommerce_backend.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductMapper mapper;
    private final ProductRepository repository;
    private final CategoryRepository categoryRepository;


    public ProductResponseDto createProduct(ProductCreateRequestDto createRequestDto)
    {
        Category category = categoryRepository.findById(createRequestDto.category_id())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        Product product= mapper.toEntity(createRequestDto);
        product.setCategory(category);
        Product savedProduct= repository.save(product);
        log.info(" Saved Product {}",savedProduct.getName());

        return mapper.toDto(savedProduct);


    }


    public ProductResponseDto getProductById(Long id) {

        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        return mapper.toDto(product);
    }


}
