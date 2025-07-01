USE insight_places;

CREATE TABLE addresses (
    address_id VARCHAR(255) PRIMARY KEY,
    street VARCHAR(255),
    number INT,
    neighborhood VARCHAR(255),
    city VARCHAR(255),
    state VARCHAR(2),
    zip_code VARCHAR(10)
);
