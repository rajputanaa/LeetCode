-- SELECT w1.id
-- FROM weather w1
-- JOIN weather w2
-- ON w1.recordDate = DATE_ADD(w2.recordDate , INTERVAL 1 DAY) 
-- WHERE w2.temperature  < w1.temperature ;


SELECT t.id
FROM weather y
CROSS JOIN weather t

WHERE DATEDIFF(t.recordDate , y.recordDate) = 1 
AND t.temperature > y.temperature;