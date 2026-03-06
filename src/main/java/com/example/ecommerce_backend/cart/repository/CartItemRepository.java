package com.example.ecommerce_backend.cart.repository;

import com.example.ecommerce_backend.cart.entity.Cart;
import com.example.ecommerce_backend.cart.entity.CartItem;
import com.example.ecommerce_backend.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartItemRepository extends JpaRepository<CartItem,Long> {

    // একটি cart এর মধ্যে product already আছে কিনা check করার জন্য
    Optional<CartItem> findByCartAndProduct(Cart cart, Product product);

}
