\echo Все роботы
SELECT *
  FROM jaegers
 ORDER BY model_name;

\echo Не уничтоженные роботы
SELECT * 
  FROM jaegers 
 WHERE status = 'Active'
 ORDER BY model_name;

\echo Роботы mark-1 и mark-4
SELECT * 
  FROM jaegers 
 WHERE mark IN (1, 4)
 ORDER BY model_name;

\echo Все роботы, кроме mark-1 и mark-4
SELECT * 
  FROM jaegers 
 WHERE mark NOT IN (1, 4)
 ORDER BY model_name;

\echo Самый старый робот
SELECT * 
  FROM jaegers 
 WHERE launch <=(SELECT MIN(launch) 
                   FROM jaegers)
 ORDER BY model_name;

\echo Роботы, которые уничтожили больше всех kaiju
SELECT * 
  FROM jaegers 
 WHERE kaiju_kill >= (SELECT MAX(kaiju_kill) 
                        FROM jaegers)
 ORDER BY kaiju_kill DESC;

\echo Средний вес роботов
SELECT ROUND(AVG(weight), 3) AS avg_weight 
  FROM jaegers;

\echo Увеличение количества убитых kaiju на 1 у не уничтоженных роботов 
UPDATE jaegers 
   SET kaiju_kill = kaiju_kill + 1 
 WHERE status = 'Active';

SELECT * 
  FROM jaegers 
 ORDER BY model_name;

\echo Удаление уничтоженных роботов
DELETE FROM jaegers 
 WHERE status = 'Destroyed';

SELECT * 
  FROM jaegers 
 ORDER BY model_name; 