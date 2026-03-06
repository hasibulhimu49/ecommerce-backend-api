package com.example.ecommerce_backend.cart.entity;

import com.example.ecommerce_backend.common.entity.Auditable;
import com.example.ecommerce_backend.common.entity.BaseEntity;
import com.example.ecommerce_backend.user.entity.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "carts_table")
@Getter
@Setter
@NamedEntityGraph(
        name = "Cart.withItems",
        attributeNodes = @NamedAttributeNode(value = "items", subgraph = "itemsGraph"),
        subgraphs = @NamedSubgraph(name = "itemsGraph", attributeNodes = @NamedAttributeNode("product"))
)
public class Cart extends BaseEntity implements Auditable {

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartItem> items = new ArrayList<>();

    // Auditable
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "updated_by")
    private Long updatedBy;

    @Transient
    public Double getTotalPrice() {
        if (items == null || items.isEmpty()) return 0.0;
        return items.stream()
                .mapToDouble(item -> item.getUnitPrice() * item.getQuantity())
                .sum();
    }

    @PrePersist
    public void onCreate() {
        LocalDateTime now = LocalDateTime.now();
        createdAt = now;
        updatedAt = now;
    }

    @PreUpdate
    public void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
}