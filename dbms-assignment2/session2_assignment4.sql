CREATE DATABASE PinDirectory;

USE pindirectory;

CREATE TABLE city(
	pincode INT(6) NOT NULL,
	city_name VARCHAR(20) NOT NULL,
	state_name VARCHAR(20) NOT NULL,
	PRIMARY KEY(pincode, state_name)
);

INSERT INTO city VALUE (302020, 'Jaipur', 'Rajasthan');
INSERT INTO city VALUE (321001, 'Bharatpur', 'Rajasthan');
INSERT INTO city VALUE (408702, 'Jammu', 'Jammu and Kashmir');
INSERT INTO city VALUE (100156, 'Ghatpur', 'Kerala');
INSERT INTO city VALUE (100155, 'Trivandram', 'Kerala');
INSERT INTO city VALUE (302020, 'Jamnagar', 'Maharashtra');
INSERT INTO city VALUE (400001, 'Mumbai', 'Maharashtra');
INSERT INTO city VALUE (400020, 'Nagpur', 'Maharashtra');

SELECT pincode AS 'Pincode', city_name AS 'City Name', state_name AS 'State Name'
	FROM city
	ORDER BY  state_name, city_name;