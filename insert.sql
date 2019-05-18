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