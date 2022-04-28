/* Tabla customer */

INSERT INTO customers (id, firstname, lastname, password) VALUES (1, 'Vitty', 'Pena', '123');
INSERT INTO customers (id, firstname, lastname, password) VALUES (2, 'Pedro', 'Dil', 'aaa');
INSERT INTO customers (id, firstname, lastname, password) VALUES (3, 'Bilbo', 'Bolson', '321');
INSERT INTO customers (id, firstname, lastname, password) VALUES (4, 'Marta', 'Rapia', 'eee');
INSERT INTO customers (id, firstname, lastname, password) VALUES (5, 'Sergio', 'Alvarez', '111');
INSERT INTO customers (id, firstname, lastname, password) VALUES (6, 'Rosa', 'Domingez', 'aea');

/* Tabla address */
INSERT INTO address (id, fk_customer, country, address, zipcode) VALUES(1, 6, 'EsPaña', 'san juan', '50015');
INSERT INTO address (id, fk_customer, country, address, zipcode) VALUES(2, 2, 'italia', 'almirante preso', '50011');
INSERT INTO address (id, fk_customer, country, address, zipcode) VALUES(3, 4, 'francia', 'av madrid', '50012');
INSERT INTO address (id, fk_customer, country, address, zipcode) VALUES(4, 3, 'EsPaña', 'carlos v', '50013');
INSERT INTO address (id, fk_customer, country, address, zipcode) VALUES(5, 1, 'alemania', 'actur', '50014');
INSERT INTO address (id, fk_customer, country, address, zipcode) VALUES(6, 5, 'EsPaña', 'las fuentes', '50010');