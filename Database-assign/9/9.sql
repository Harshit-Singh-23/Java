-- Q. Find the order number, salesperson name, along with the customer to whom that order belongs to


select om.order_id as 'order number', s.name as 'Sales Person Name', c.customer_name as 'Customer Name' from 
sales_person s inner join order_map om on om.s_id = s.id inner join customers c on om.customer_id=c.customer_id;
