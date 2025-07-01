SELECT o.name AS owner_name, COUNT(b.booking_id)
AS total_inactive_bookings
FROM owners o
JOIN bookings b ON o.owner_id = b.owner_id
WHERE b.active = 0
GROUP BY o.owner_id
ORDER BY total_inactive_bookings DESC
LIMIT 10;