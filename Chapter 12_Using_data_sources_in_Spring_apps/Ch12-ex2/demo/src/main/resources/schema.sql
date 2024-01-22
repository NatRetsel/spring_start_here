CREATE TABLE IF NOT EXISTS purchase ( 
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
	product varchar(50) NOT NULL, 
	price double NOT NULL 
);