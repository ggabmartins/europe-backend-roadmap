DELETE FROM ratings
WHERE booking_id IN ('10000','1001');

DELETE FROM reservations
WHERE booking_id IN ('10000','1001');

DELETE FROM bookings
WHERE booking_id IN ('10000','1001');