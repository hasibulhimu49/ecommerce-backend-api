CREATE TABLE cart_items
(
    id         BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    cart_id    BIGINT NOT NULL,
    product_id BIGINT NOT NULL,
    quantity   INT    NOT NULL,
    unit_price DOUBLE NOT NULL,
    CONSTRAINT fk_cart FOREIGN KEY (cart_id) REFERENCES carts_table (id),
    CONSTRAINT fk_product FOREIGN KEY (product_id) REFERENCES products_table (id),
    CONSTRAINT uk_cart_product UNIQUE (cart_id, product_id)
);