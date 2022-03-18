-- Q. Find the all sales person details along with order details
select s.id as 'Sales Person Number', s.name, o.order_item from sales_person s inner join order_map om on om.s_id = s.id 
inner join orders o on om.order_id=o.order_id;
