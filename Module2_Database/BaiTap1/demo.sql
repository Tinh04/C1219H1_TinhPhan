use classicmodels;
select * from customers;
SET SQL_SAFE_UPDATES = 0;
update customers set customerName = 'Tho' where customerNumber = 103;


use classicmodels;
select * from classicmodels;

-- su dung toan tu "="
select * from classicmodels where country = 'USA';

-- su dung toan tu "<>"
select * from classicmodels where (country <> 'USA');

-- su dung toan tu ">="
select * from classicmodels where length(customerNumber) >= 10;

-- su dung toan tu "Between"
select * from classicmodels where customerNumber between '120' and '125';

-- su dung toan tu "Like"
select * from classicmodels where customerName like '%M%';

-- su dung toan tu "IN"
select * from classicmodels where country in ('USA' , 'Poland', 'France');

-- su dung toan toan "OR"
select * from classicmodels where (( customerName like 'A%' ) or (customerName like '%S%'));

-- su dung toan tu "AND"
select * from classicmodels where (( customerName like 'A%' )  and (length(customerName) <= 10));

-- su dung toan tu "NOT"
select * from classicmodels where country not in ('USA' , 'Poland', 'France');

select * from employees;

-- su dung "INNER JOIN" 
select customers.customerNumber, employees.lastName from customers inner join employees on customers.customerName = employees.lastName;

-- su dung "LEFT JOIN"
select customers.customerNumber, employees.lastName
from customers
left join employees on customers.customerName = employees.lastName;

-- su dung "RIGHT JOIN"
select customers.customerNumber, employees.lastName
from customers
right join employees on customers.customerName = employees.lastName;

-- su dung "GROUP BY"
select  COUNT(customerNumber), country
from customers
group by country;

-- su dung "HAVING"
select  COUNT(customerNumber), country
from customers
group by country
having COUNT(CustomerID) > 5;

-- su dung "ORDER BY"
select * from customers order by contactFirstName;
