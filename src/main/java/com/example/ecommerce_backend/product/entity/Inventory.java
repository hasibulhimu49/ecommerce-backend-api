package com.example.ecommerce_backend.product.entity;

import com.example.ecommerce_backend.common.entity.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "inventory_table")
@Getter
@Setter
public class Inventory extends BaseEntity{

    @Column(name = "quantity_available")
    @NotNull(message = "Quantity can not be empty")
    private Integer quantityAvailable;

    @OneToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;


    @Version
    private Long version; // for prevent lost update problem   // Hibernate automatically increase করে
}
