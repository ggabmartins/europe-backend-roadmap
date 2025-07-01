USE insight_places;

CREATE TABLE ratings (
rating_id VARCHAR(255) PRIMARY KEY,
client_id VARCHAR(255),
booking_id VARCHAR(255),
rating INT,
comment TEXT,
FOREIGN KEY (client_id) REFERENCES clients(client_id),
FOREIGN KEY (booking_id) REFERENCES bookings(booking_id)
);