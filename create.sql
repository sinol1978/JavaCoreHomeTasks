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
	FOREIGN KEY(product_id) REFERENCES products(id),
	FOREIGN KEY(cart_id) REFERENCES carts(id)
);
