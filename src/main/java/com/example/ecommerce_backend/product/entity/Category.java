package com.example.ecommerce_backend.product.entity;

import com.example.ecommerce_backend.common.entity.Auditable;
import com.example.ecommerce_backend.common.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "categories_table")
@Getter
@Setter
public class Category extends BaseEntity implements Auditable {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String code;

    @Column
    private Boolean isActive;


    //Auditable
    @Column(name = "created_At")
    private LocalDateTime createdAt;

    @Column(name = "updated_At")
    private LocalDateTime updatedAt;

    @Column(name = "created_BY")
    private Long createdBy;

    @Column(name = "updated_By")
    private Long updatedBy;



}
