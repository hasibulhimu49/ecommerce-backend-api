package com.example.ecommerce_backend.product.service.impl;

import com.example.ecommerce_backend.product.dto.request.InventoryCreateRequestDto;
import com.example.ecommerce_backend.product.dto.response.InventoryResponseDto;
import com.example.ecommerce_backend.product.entity.Inventory;
import com.example.ecommerce_backend.product.entity.Product;
import com.example.ecommerce_backend.product.mapper.InventoryMapper;
import com.example.ecommerce_backend.product.repository.InventoryRepository;
import com.example.ecommerce_backend.product.repository.ProductRepository;
import com.example.ecommerce_backend.product.service.InventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryServiceImpl implements InventoryService {
    private final InventoryMapper mapper;
    private final InventoryRepository inventoryRepositor;
    private final ProductRepository  productRepository;


    public InventoryResponseDto createInventory(InventoryCreateRequestDto requestDto)
    {
        Product product=productRepository.findById(requestDto.productId()).orElseThrow(() -> new RuntimeException("Product not found"));

        Inventory inventory=mapper.toEntity(requestDto);
        inventory.setProduct(product);
        log.info("Inventory product id: {}", inventory.getProduct().getId());
        Inventory savedInventory=inventoryRepositor.save(inventory);
        return mapper.toDto(savedInventory);

    }
}
