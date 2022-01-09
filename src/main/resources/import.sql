INSERT INTO BRANDS ( name ) values ('Bandai');
INSERT INTO BRANDS ( name ) values ('Good Smile Company');
INSERT INTO BRANDS ( name ) values ('Sega');

INSERT INTO SITES ( brand_id, url ) values (1,'www.bandai.com');
INSERT INTO SITES ( brand_id, url ) values (2,'www.goodsmilecompany.com');
INSERT INTO SITES ( brand_id, url ) values (3,'www.sega.com');

INSERT INTO CATEGORIES ( name ) values ('Dragon Ball');
INSERT INTO CATEGORIES ( name ) values ('Gundam');
INSERT INTO CATEGORIES ( name ) values ('Kimetsu no Yaiba');
INSERT INTO CATEGORIES ( name ) values ('Evangelion');


INSERT INTO Product ( brand_id, category_id, name, price, created_at ) values ( 1, 1, 'Goku', 1000, NOW() );
INSERT INTO Product ( brand_id, category_id, name, price, created_at ) values ( 1, 1, 'Vegeta', 900, NOW() );
INSERT INTO Product ( brand_id, category_id, name, price, created_at ) values ( 3, 4, 'Shinji', 2500, NOW() );
INSERT INTO Product ( brand_id, category_id, name, price, created_at ) values ( 1, 2, 'Gundam Unicorn', 2000, NOW() );
INSERT INTO Product ( brand_id, category_id, name, price, created_at ) values ( 2, 3, 'Inosuke', 1500, NOW() );

INSERT INTO ORDERS (CREATED_AT, DESCRIPTION) values (  NOW(), 'Dragon Ball Order'  );
INSERT INTO ORDERS (CREATED_AT, DESCRIPTION) values (  NOW(), 'Gundam Order'  );
INSERT INTO ORDERS (CREATED_AT, DESCRIPTION) values (  NOW(), 'Evangelion Order'  );
INSERT INTO ORDERS (CREATED_AT, DESCRIPTION) values (  NOW(), 'KNY Order'  );
INSERT INTO ORDERS (CREATED_AT, DESCRIPTION) values (  NOW(), 'Vegeta fan order'  );

INSERT INTO ORDERS_PRODUCTS ( ORDER_ID, PRODUCT_ID ) values (1, 1);
INSERT INTO ORDERS_PRODUCTS ( ORDER_ID, PRODUCT_ID ) values (1, 2);
INSERT INTO ORDERS_PRODUCTS ( ORDER_ID, PRODUCT_ID ) values (2, 4);
INSERT INTO ORDERS_PRODUCTS ( ORDER_ID, PRODUCT_ID ) values (3, 3);
INSERT INTO ORDERS_PRODUCTS ( ORDER_ID, PRODUCT_ID ) values (4, 5);
INSERT INTO ORDERS_PRODUCTS ( ORDER_ID, PRODUCT_ID ) values (5, 2);
