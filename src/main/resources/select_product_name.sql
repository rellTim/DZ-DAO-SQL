select product_name from ORDERS o
                             join CUSTOMERS c on c.id = o.customer_id
where lower(c.name) = lower(:name);