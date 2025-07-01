SELECT client_id, AVG(total_price) AS average_ticket
FROM rents
GROUP BY  client_id;