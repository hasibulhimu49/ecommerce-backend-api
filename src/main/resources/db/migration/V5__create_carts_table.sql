CREATE TABLE carts_table
(
    id         BIGSERIAL PRIMARY KEY,
    user_id    BIGINT NOT NULL,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    created_by BIGINT,
    updated_by BIGINT,
    CONSTRAINT fk_cart_user
        FOREIGN KEY (user_id)
            REFERENCES users_table (id)
);