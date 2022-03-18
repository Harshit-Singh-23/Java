-- Q. Find the sales person have multiple orders
select s.name, count(*) AS 'order count' from sales_person s inner join order_map om on om.s_id = s.id group by s.name having count(*)>1;
