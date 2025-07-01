USE insight_places;

CREATE TABLE clients (
    client_id VARCHAR(255) PRIMARY KEY,
    name VARCHAR(255),
    cpf VARCHAR(14),
    contact VARCHAR(255)
);