package com.example.ecommerce_backend.product.controller;

import com.example.ecommerce_backend.common.constants.ApiEndpoints;
import com.example.ecommerce_backend.product.dto.request.InventoryCreateRequestDto;
import com.example.ecommerce_backend.product.dto.response.InventoryResponseDto;
import com.example.ecommerce_backend.product.service.InventoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiEndpoints.InventoryAdmin.BASE_INVENTORY_ADMIN)
@RequiredArgsConstructor
@Tag(name = "Inventory Admin API", description ="This is related to Inventory" )
public class InventoryAdminController {

    private final InventoryService service;

    @Operation(summary = "Create a new Product Inventory",description = "Create a new inventory in the system")
    @PostMapping
    public InventoryResponseDto createInventory(@Valid @RequestBody InventoryCreateRequestDto requestDto)
    {
        return service.createInventory(requestDto);
    }
}
