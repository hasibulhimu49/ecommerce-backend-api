package com.example.ecommerce_backend.product.controller;

import com.example.ecommerce_backend.common.constants.ApiEndpoints;
import com.example.ecommerce_backend.product.dto.request.ProductCreateRequestDto;
import com.example.ecommerce_backend.product.dto.response.ProductResponseDto;
import com.example.ecommerce_backend.product.service.ProductService;
import com.example.ecommerce_backend.common.dto.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiEndpoints.ProductAdmin.BASE_PRODUCT_ADMIN)
@RequiredArgsConstructor
@Tag(name = "Product Admin API", description = "This is related to products")
@Slf4j
public class ProductAdminController {

    private final ProductService productService;

    @Operation(summary = "Create a new Product", description = "Creates a new product in the system")
    @ApiResponses(value = {
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "201", description = "Product created successfully"),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "400", description = "Invalid input data")
    })
    @PostMapping
    public ResponseEntity<ApiResponse<ProductResponseDto>> createProduct(@Valid @RequestBody ProductCreateRequestDto requestDto) {
        log.info("First check {}", requestDto.name());
        ProductResponseDto response = productService.createProduct(requestDto);

        log.info("Response successfull{}",response.getName());

        // Return 201 CREATED with ApiResponse wrapper
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.success("Product created successfully", response));
    }





    // TODO: Implement endpoint to update product information
    //      (name, price, description)

    // TODO: Implement functionality to reassign a product to a different category

    // TODO: Implement endpoint to activate or deactivate a product
    //      (soft delete via isActive flag)

    // TODO: Implement endpoint to permanently delete a product
}