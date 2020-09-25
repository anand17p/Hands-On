SELECT AVG(h8) AS 'average_8th_hour_consumption' FROM electricity_reading;
SELECT AVG(total_units) AS 'average_units_of_electricity' FROM electricity_reading;
SELECT AVG(payable_amount)  AS 'average_payable_amount'   FROM bill WHERE  payable_amount>10000;
SELECT AVG(fine_amount)  AS 'average_fine_amount'  FROM bill WHERE  year=2018;
SELECT SUM(payable_amount)  AS 'sum_payable_amount'  FROM bill ;
SELECT SUM(payable_amount)  AS 'sum_payable_amount'  FROM bill WHERE  due_date ='2017-10-01' ;
SELECT MIN(total_units) AS 'min_total_units' FROM electricity_reading;
SELECT MIN(fine_amount)  AS 'second_min_fine_amount'  FROM bill WHERE fine_amount>(SELECT MIN(fine_amount) FROM bill);
SELECT STDDEV(fine_amount)  AS 'standard_deviation_amount'  FROM bill WHERE  year=2018;