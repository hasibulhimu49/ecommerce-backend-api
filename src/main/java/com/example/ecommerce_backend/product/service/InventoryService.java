package com.example.ecommerce_backend.product.service;

import com.example.ecommerce_backend.product.dto.request.InventoryCreateRequestDto;
import com.example.ecommerce_backend.product.dto.response.InventoryResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface InventoryService {

    InventoryResponseDto createInventory(InventoryCreateRequestDto requestDto);
}
