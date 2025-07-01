USE insight_places;

CREATE TABLE rents (
    rent_id VARCHAR(255) PRIMARY KEY,
    client_id VARCHAR(255),
    booking_id VARCHAR(255),
    start_date DATE,
    end_date DATE,
    total_price DECIMAL(10, 2),
    FOREIGN KEY (client_id) REFERENCES clients(client_id),
    FOREIGN KEY (booking_id) REFERENCES bookings(booking_id)
);