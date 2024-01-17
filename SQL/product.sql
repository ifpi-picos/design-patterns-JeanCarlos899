CREATE TABLE Product (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    price DECIMAL(4, 2) NOT NULL,
    quantity INT NOT NULL
);