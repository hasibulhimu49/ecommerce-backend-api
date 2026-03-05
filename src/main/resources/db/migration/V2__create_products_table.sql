CREATE TABLE products_table
(
    id          BIGSERIAL PRIMARY KEY,

    name        VARCHAR(200)   NOT NULL,
    description VARCHAR(500),
    sku         VARCHAR(50)    NOT NULL UNIQUE,
    price       NUMERIC(15, 2) NOT NULL,

    image_url   VARCHAR(250),
    is_active   BOOLEAN        NOT NULL DEFAULT TRUE,

    category_id BIGINT         NOT NULL,

    created_at  TIMESTAMP,
    updated_at  TIMESTAMP,
    created_by  BIGINT,
    updated_by  BIGINT,

    CONSTRAINT fk_products_category
        FOREIGN KEY (category_id)
            REFERENCES categories_table (id)
            ON DELETE RESTRICT
);