SELECT building_owner_name,length(building_owner_name) AS  'name_length' FROM building_details ORDER BY building_owner_name; 
SELECT building_owner_name,contact_number FROM building_details group by building_owner_name having length(building_owner_name)<=(SELECT MIN(length(building_owner_name))FROM building_details )ORDER BY building_owner_name; 
SELECT building_owner_name,concat(contact_number ,"-",email_address) AS 'contact_details' FROM building_details ORDER BY building_owner_name;
SELECT substring(meter_number,1,3) AS 'meter_code' FROM meter ORDER BY meter_code DESC;
SELECT building_owner_name FROM building_details WHERE building_owner_name LIKE '%di%'   ORDER BY building_owner_name;  
SELECT count(*) AS 'bills_paid_withoutfine' FROM bill WHERE (fine_amount=0 AND year=2017);
SELECT SUM(fine_amount) AS 'total_fine' FROM bill WHERE due_date between '2017-10-01' and '2017-11-01';
SELECT day,total_units FROM bill WHERE due_date between '2017-09-10' AND '2017-10-10' ORDER BY day;
SELECT due_date,payable_amount FROM bill WHERE due_date not between '2017-09-10' AND '2017-10-10';