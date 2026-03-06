package com.example.ecommerce_backend.cart.repository;

import com.example.ecommerce_backend.cart.entity.Cart;
import com.example.ecommerce_backend.user.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart,Long> {

    // User এর জন্য Cart fetch করা
    @EntityGraph(value = "Cart.withItems", type = EntityGraph.EntityGraphType.LOAD)
    Optional<Cart> findByUser(User user);

}
