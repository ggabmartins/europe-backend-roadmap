SELECT client_id, AVG(DATEDIFF(end_date, start_date)) AS avg_stay_duration
FROM reservations
GROUP BY client_id
ORDER BY avg_stay_duration DESC;