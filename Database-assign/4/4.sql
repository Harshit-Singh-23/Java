-- Q. Insert sample data

--FOR CUSTOMERS TABLE
INSERT INTO customers values(101, 'Harshit', 'Punjab');
INSERT INTO customers values( 'Utkarsh', 'Delhi');
INSERT INTO customers(customer_name,Location) values( 'Utkarsh', 'Delhi');
INSERT INTO customers(customer_name,Location) values( 'Anmol', 'Meerut');
INSERT INTO customers(customer_name,Location) values( 'Harry', 'Punjab');
INSERT INTO customers(customer_name,Location) values( 'Devansh', 'Dehradun');
-- FOR ORDERS TABLE
INSERT INTO orders(order_id,order_item) values(1001, 'Shirt');
INSERT INTO orders(order_item) values( 'Pant');
INSERT INTO orders(order_item) values( 'T-Shirt');
INSERT INTO orders(order_item) values( 'Jeans');
-- FOR SALES_PERSON TABLE
INSERT INTO sales_person(id, name) values(1, 'Aakash');
INSERT INTO sales_person( name) values( 'Suresh');
