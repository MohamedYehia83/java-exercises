-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)

select title, a.first_name, a.last_name
from film f inner join film_actor fa on f.film_id = fa.film_id
            inner join actor a      on fa.actor_id = a.actor_id
where first_name = 'NICK'       and last_name = 'STALLONE';

-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)

select title, a.first_name, a.last_name
from film f inner join film_actor fa on f.film_id = fa.film_id
            inner join actor a      on fa.actor_id = a.actor_id
where first_name = 'RITA'       and last_name = 'REYNOLDS';

-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)

select title, a.first_name, a.last_name
from film f inner join film_actor fa on f.film_id = fa.film_id
            inner join actor a      on fa.actor_id = a.actor_id
where (first_name = 'RIVER'       and last_name = 'DEAN')
OR (first_name = 'JUDY'       and last_name = 'DEAN');

-- 4. All of the the ‘Documentary’ films
-- (68 rows)

SELECT title, category.category_id,category.name
from film  
inner join film_category  
on film.film_id = film_category.film_id
inner join category       
on film_category.category_id = category.category_id
where category.name = 'Documentary';

-- 5. All of the ‘Comedy’ films
-- (58 rows)

SELECT title, category.category_id,category.name
from film  
inner join film_category  
on film.film_id = film_category.film_id
inner join category       
on film_category.category_id = category.category_id
where category.name = 'Comedy';

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)

SELECT title, category.category_id,category.name
from film  
inner join film_category  
on film.film_id = film_category.film_id
inner join category       
on film_category.category_id = category.category_id
where category.name = 'Children' and film.rating = 'G';

-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)

SELECT title                            
from film  
inner join film_category  
on film.film_id = film_category.film_id
inner join category       
on film_category.category_id = category.category_id
where category.name = 'Family' and film.rating = 'G' and film.length < 120;


-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)

select title, actor.first_name, actor.last_name
from film  inner join film_actor  on film.film_id = film_actor.film_id
            inner join actor       on film_actor.actor_id = actor.actor_id
where first_name = 'MATTHEW'       and last_name = 'LEIGH' AND film.rating = 'G';

-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)

SELECT title, category.category_id,category.name
from film  
inner join film_category  
on film.film_id = film_category.film_id
inner join category       
on film_category.category_id = category.category_id
where category.name = 'Sci-Fi' and film.release_year = '2006';

-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)

select title, actor.first_name, actor.last_name, category.category_id,category.name
from film   inner join film_actor  on film.film_id = film_actor.film_id
            inner join actor       on film_actor.actor_id = actor.actor_id
  
            inner join film_category  on film.film_id = film_category.film_id
            inner join category       on film_category.category_id = category.category_id
where first_name = 'NICK'       and last_name = 'STALLONE'  and category.name = 'Action';

-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)

select store_id, address.address, address.district, city.city, country.country
from store  inner join address    on store.address_id = address.address_id
            inner join city       on address.city_id = city.city_id
            inner join country    on city.country_id = country.country_id

-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)

select store.store_id, address.address, staff.first_name, staff.last_name
from store  inner join address    on store.address_id = address.address_id
            inner join staff      on store.manager_staff_id = staff.staff_id
;
            
-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)

select customer.first_name, customer.last_name, count(*) as number_of_rental
from customer inner join rental on customer.customer_id = rental.customer_id
GROUP BY customer.last_name, customer.first_name
order by number_of_rental DESC
 limit 10

-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)

select customer.first_name, customer.last_name, sum(payment.amount) as dollars_spent       
from customer inner join payment on customer.customer_id = payment.customer_id
GROUP BY customer.last_name, customer.first_name
order by dollars_spent DESC
 limit 10

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)

select store.store_id, address.address, count(rental) as number_of_rental,  sum(payment.amount) as total_sales, avg(payment.amount) as avg_sale
from store    inner join address on store.address_id = address.address_id
              inner join inventory on inventory.store_id = store.store_id
              inner join rental on inventory.inventory_id = rental.inventory_id
              inner join payment on rental.rental_id = payment.rental_id

group by store.store_id, address.address;

-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)

select film.title, count(*) as number_of_rentals
from film inner join inventory on film.film_id = inventory.film_id
          inner join rental on inventory.inventory_id = rental.inventory_id
group by film.title,  inventory.film_id 
order by number_of_rentals desc
 limit 10;     

-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)

select category.name, count(*) as number_of_rentals
from category inner join film_category on category.category_id = film_category.category_id
              inner join film          on film_category.film_id = film.film_id
              inner join inventory     on film.film_id = inventory.film_id    
              inner join rental        on inventory.inventory_id = rental.inventory_id
group by category.name 
order by number_of_rentals desc
 limit 5;    

-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)

select film.title,category.name, count(rental.rental_id) as number_of_rentals                     
from category inner join film_category on category.category_id = film_category.category_id
              inner join film on film_category.film_id = film.film_id
              inner join inventory on film.film_id = inventory.film_id    
              inner join rental on inventory.inventory_id = rental.inventory_id
where category.name = 'Action'
group by film.title, category.name 
order by number_of_rentals desc
 limit 5;  

-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)

select actor.first_name, actor.last_name, count(rental.rental_id) as number_of_rentals            
from actor    inner join film_actor on actor.actor_id = film_actor.actor_id
              inner join film       on film_actor.film_id = film.film_id
              inner join inventory  on film.film_id = inventory.film_id    
              inner join rental     on inventory.inventory_id = rental.inventory_id
group by actor.first_name, actor.last_name, actor.actor_id
order by number_of_rentals desc
 limit 10;  

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)

select actor.first_name, actor.last_name, count(rental.rental_id) as number_of_rentals            
from actor    inner join film_actor on actor.actor_id = film_actor.actor_id
              inner join film       on film_actor.film_id = film.film_id
              inner join film_category on film.film_id = film_category.film_id
              inner join inventory  on film.film_id = inventory.film_id    
              inner join rental     on inventory.inventory_id = rental.inventory_id
where film_category.category_id = 5
group by actor.first_name, actor.last_name, actor.actor_id 
order by number_of_rentals desc
 limit 5;  