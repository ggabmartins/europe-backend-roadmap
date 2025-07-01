USE insight_places;

CREATE TABLE bookings (
    booking_id VARCHAR(255) PRIMARY KEY,
    type VARCHAR(50),
    address_id VARCHAR(255),
    owner_id VARCHAR(255),
        active bool,
    FOREIGN KEY (address_id) REFERENCES addresses(address_id),
    FOREIGN KEY (owner_id) REFERENCES owners(owner_id)
);
