package com.example.ecommerce_backend.product.entity;

import com.example.ecommerce_backend.common.entity.Auditable;
import com.example.ecommerce_backend.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "products_table")
@Getter
@Setter
public class Product extends BaseEntity implements Auditable {


    @Column(nullable = false, length = 200)
    private String name;

    @Column(length = 500)
    private String description;

    @Column(nullable = false,length = 50)
    private String sku; // Stock Keeping Unit

    @Column(nullable = false)
    private Double price;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "is_active")
    private Boolean isActive;


    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "category_id",nullable = false)
    Category category;


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
