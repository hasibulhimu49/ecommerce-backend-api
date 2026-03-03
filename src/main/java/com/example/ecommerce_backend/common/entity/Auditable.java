package com.example.ecommerce_backend.common.entity;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

public interface Auditable {
    LocalDateTime getCreatedAt();
    void setCreatedAt(LocalDateTime createdAt);

    LocalDateTime getUpdatedAt();
    void setUpdatedAt(LocalDateTime updatedAt);


    Long getCreatedBy();
    void setCreatedBy(Long createdBy);

    Long getUpdatedBy();
    void setUpdatedBy(Long updatedBy);



}
