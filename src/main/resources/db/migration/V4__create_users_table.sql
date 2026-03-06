CREATE TABLE users_table (
                             id BIGSERIAL PRIMARY KEY,
                             name VARCHAR(255),
                             email VARCHAR(255) UNIQUE NOT NULL,
                             password VARCHAR(255) NOT NULL,
                             address VARCHAR(255),
                             role VARCHAR(50)
);