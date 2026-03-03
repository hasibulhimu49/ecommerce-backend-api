package com.example.ecommerce_backend.product.controller;

import com.example.ecommerce_backend.common.constants.ApiEndpoints;
import com.example.ecommerce_backend.product.dto.request.CategoryCreateRequestDto;
import com.example.ecommerce_backend.product.dto.response.CategoryResponseDto;
import com.example.ecommerce_backend.product.service.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(ApiEndpoints.CategoryAdmin.BASE_CATEGORY_ADMIN)
@RequiredArgsConstructor
@Tag(name = "Category API", description = "Operation related to Category")
public class CategoryAdminController {


    private final CategoryService service;


    @Operation(summary = "create a new category", description = "create a new description in the system")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "category create successfully"),
            @ApiResponse(responseCode = "400",description = "Invalid input data")
    })
    @PostMapping
    public ResponseEntity<CategoryResponseDto> createCategory(@Valid @RequestBody CategoryCreateRequestDto requestDto)
    {

        return ResponseEntity.ok(service.createCategory(requestDto));

    }




    // TODO: Implement endpoint to update category information
    //      (name, description)

    // TODO: Implement endpoint to activate or deactivate a category
    //      (soft delete via isActive flag)

    // TODO: Implement endpoint to permanently delete a category




}
