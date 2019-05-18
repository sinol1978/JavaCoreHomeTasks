CREATE DATABASE mystore
USE mystore

create TABLE categories(
	id INT(5) NOT NULL AUTO_INCREMENT,
	name varchar(50),
	primary key(id)
);

CREATE TABLE products(
	id INT(5) NOT NULL AUTO_INCREMENT,
	name varchar(50),
	price DECIMAL(15,2),
	rating INT(2),
	category_id INT(5),
	primary key(id),
	FOREIGN KEY(category_id) REFERENCES categories(id)
);

CREATE TABLE users(
	id INT(5) NOT NULL AUTO_INCREMENT,
	login VARCHAR(50),
	pass VARCHAR(50),
	PRIMARY KEY(id)
);

CREATE TABLE carts(
	id INT(5) NOT NULL AUTO_INCREMENT,
	user_id INT(5),
	orderdate DATE,
	PRIMARY KEY(id),
	FOREIGN KEY(user_id) REFERENCES users(id)
);

CREATE TABLE products_carts(
	product_id INT(5),
	cart_id INT(5),
	PRIMARY KEY (product_id, cart_id),
	FOREIGN KEY(product_id) REFERENCES products(id),
	FOREIGN KEY(cart_id) REFERENCES carts(id)
);

INSERT INTO categories (NAME) VALUES 
	('Cameras'), ('Books'), ('Bikes');

SELECT * FROM categories

INSERT INTO products (NAME, price, rating, category_id) VALUES
	('Comics Book',10.5,5,2),
	('Magazine',1.2,3,2),
	('Canon',300.5,5,1),
	('Nikon',150.5,4,1),
	('Scott',730.5,3,3),
	('Cannondale',900.5,5,3),
	('Shwinn', 870.5,4,3);
	
SELECT products.name, Price, categories.name FROM products 
	INNER JOIN categories ON products.category_id=categories.id
	ORDER BY categories.name
	
	
SELECT * FROM products WHERE id=1	
INSERT INTO products ('name', 'price', 'rating', 'category_id') VALUES
	
DELETE 	