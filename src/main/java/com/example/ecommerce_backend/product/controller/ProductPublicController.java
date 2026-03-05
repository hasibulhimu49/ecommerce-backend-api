package com.example.ecommerce_backend.product.controller;

import com.example.ecommerce_backend.common.constants.ApiEndpoints;
import com.example.ecommerce_backend.product.dto.response.ProductResponseDto;
import com.example.ecommerce_backend.product.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiEndpoints.ProductPublic.BASE_PRODUCT_PUBLIC)
@RequiredArgsConstructor
@Tag(name = "Product User API",description = "This is related to product")
public class ProductPublicController {

    private final ProductService service;

    @Operation(summary = "Get product by id")
    @GetMapping("/{id}")
    public ProductResponseDto getProductById(@PathVariable Long id)
    {
        return service.getProductById(id);
    }


    // TODO: Implement paginated product listing with filters
    //      (category, active status, price range)
}
