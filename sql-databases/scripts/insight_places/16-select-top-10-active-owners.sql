SELECT o.name AS owner_name, COUNT(b.booking_id)
AS total_active_bookings
FROM owners o
JOIN bookings b ON o.owner_id = b.owner_id
WHERE b.active =1
GROUP BY o.owner_id
ORDER BY total_active_bookings DESC
LIMIT 10;