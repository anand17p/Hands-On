SELECT * FROM electricity_connection_type;
SELECT * FROM electricity_connection_type ORDER BY connection_name;
SELECT * FROM building_type ORDER BY name;
SELECT * FROM building_details ORDER BY building_owner_name;
SELECT * FROM electricity_reading ORDER BY total_units DESC;
SELECT meter_number FROM meter;
SELECT building_owner_name,contact_number FROM building_details ORDER BY building_owner_name;
SELECT total_units, payable_amount, fine_amount FROM bill ORDER BY total_units DESC;
SELECT * FROM slab ORDER BY from_uit;
SELECT * FROM building_details WHERE building_owner_name='Nicholas';
SELECT * FROM bill WHERE total_units>10000 ORDER BY total_units DESC;
SELECT * FROM bill WHERE due_date='2017-10-01' ORDER BY payable_amount  DESC;
SELECT building_owner_name,contact_number FROM building_details WHERE email_address=null ORDER BY building_owner_name;
SELECT * FROM building_details WHERE building_owner_name LIKE 'M%';
SELECT * FROM building_details WHERE building_type_id=2 ORDER BY building_owner_name;
SELECT * FROM electricity_reading WHERE total_units >=500 and total_units<=1000 ORDER BY total_units;
SELECT meter_id ,total_units FROM electricity_reading WHERE h13<h14 ORDER BY total_units;


