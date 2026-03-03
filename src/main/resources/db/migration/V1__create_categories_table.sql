-- V1__create_categories_table.sql

CREATE TABLE categories_table (
                            id BIGSERIAL PRIMARY KEY,          -- BaseEntity id
                            name VARCHAR(255) NOT NULL,
                            code VARCHAR(255) NOT NULL,
                            is_active BOOLEAN NOT NULL DEFAULT TRUE,

                            created_at TIMESTAMP,
                            updated_at TIMESTAMP,
                            created_by BIGINT,
                            updated_by BIGINT
);