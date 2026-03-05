CREATE TABLE inventory_table
(
    id                 BIGSERIAL PRIMARY KEY,
    quantity_available INTEGER NOT NULL CHECK ( quantity_available >= 0 ),
    product_id         BIGINT  NOT NULL,
    version            BIGINT  NOT NULL DEFAULT 0,

    CONSTRAINT fk_product_id
        FOREIGN KEY (product_id)
            REFERENCES products_table (id)
            ON DELETE RESTRICT
);