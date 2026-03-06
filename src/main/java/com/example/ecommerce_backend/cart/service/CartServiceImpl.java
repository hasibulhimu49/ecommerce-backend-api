package com.example.ecommerce_backend.cart.service;
import com.example.ecommerce_backend.cart.dto.request.AddToCartRequestDto;
import com.example.ecommerce_backend.cart.dto.request.CartItemRequestDto;
import com.example.ecommerce_backend.cart.dto.response.CartResponseDto;
import com.example.ecommerce_backend.cart.entity.Cart;
import com.example.ecommerce_backend.cart.entity.CartItem;
import com.example.ecommerce_backend.cart.mapper.CartMapper;
import com.example.ecommerce_backend.cart.repository.CartItemRepository;
import com.example.ecommerce_backend.cart.repository.CartRepository;
import com.example.ecommerce_backend.cart.service.impl.CartService;
import com.example.ecommerce_backend.product.entity.Product;
import com.example.ecommerce_backend.product.repository.ProductRepository;
import com.example.ecommerce_backend.user.entity.User;
import com.example.ecommerce_backend.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;
    private final CartMapper cartMapper;

    @Transactional
    public CartResponseDto addToCart(Long userId, AddToCartRequestDto request) {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Product product = productRepository.findById(request.productId())
                .orElseThrow(() -> new RuntimeException("Product not found"));

        // cart exist check
        Cart cart = cartRepository.findByUser(user)
                .orElseGet(() -> {
                    Cart newCart = new Cart();
                    newCart.setUser(user);
                    return cartRepository.save(newCart);
                });

        // item already exists?
        CartItem cartItem = cartItemRepository
                .findByCartAndProduct(cart, product)
                .orElse(null);

        if (cartItem != null) {

            // update quantity
            cartItem.setQuantity(cartItem.getQuantity() + request.quantity());

        } else {

            CartItem newItem = new CartItem();
            newItem.setCart(cart);
            newItem.setProduct(product);
            newItem.setQuantity(request.quantity());
            newItem.setUnitPrice(product.getPrice());

            cart.getItems().add(newItem);
        }

        Cart savedCart = cartRepository.save(cart);

        return cartMapper.toDto(savedCart);
    }





    @Override
    public CartResponseDto getCart() {
        return null;
    }

    @Override
    public CartResponseDto addItemToCart(CartItemRequestDto requestDto) {
        return null;
    }

    @Override
    public CartResponseDto updateItemQuantity(CartItemRequestDto requestDto) {
        return null;
    }

    @Override
    public CartResponseDto removeItemFromCart(Long cartItemId) {
        return null;
    }
}