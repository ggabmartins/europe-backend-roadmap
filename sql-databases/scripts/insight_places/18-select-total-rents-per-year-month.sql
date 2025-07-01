SELECT YEAR(start_date) AS year,
MONTH(end_date) AS month,
COUNT(*) AS total_rents
FROM rents
GROUP BY year, month
ORDER BY total_rents DESC;