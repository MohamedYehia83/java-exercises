-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

/*
insert into actor (actor_id, first_name, last_name)  
values            (201, 'Hampton',  'Avenue'),
                  (202, 'Lisa',  'Byway');
*/

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	

/*
INSERT INTO film(film_id, title, description, release_year, language_id, length)
values          (1001, 'Euclidean PI', 'A pizza delivery boy in ancient Greece', 2008, 1, 198);

*/

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

/*
INSERT INTO film_actor(actor_id, film_id)
values                (201,      1001),
                      (202,      1001);
*/

-- 4. Add Mathmagical to the category table.

/*
INSERT INTO category(category_id, name)
values                (17,      'Mathmagical');
 */                    
                      
-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

/*
INSERT INTO film_category(film_id, category_id)
values                   (1001,         17),
                         (274,         17),
                         (494,         17),
                         (714,         17),
                         (996,         17);
*/
                         
-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)

/*
update film
set rating = 'G'
where film_id in (select film_id
 from film_category
 where category_id = 17);
 */

-- 7. Add a copy of "Euclidean PI" to all the stores.

/*
insert into inventory (film_id, store_id)
values(1001, 1),
       (1001, 2);
*/
-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)

/*
delete from film
where title = 'Euclidean PI';

*/
-- didnt work because film_id still used in film_actor table

-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)

/*
delete from category
where name = 'Mathmagical';

*/
-- didnt work because category_id is still used in film_category

-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)

/*
delete from film_category
where category_id = 17;
*/
-- it worked because category_id is not used in film_category

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)
/*
delete from category
where name = 'Mathmagical';
*/
-- it worked because i deleted category_id from film_category
/*
delete from film
where title = 'Euclidean PI';
*/
-- it didnt work because film_id still used in film_actor table

-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.

-- Film_id need to be removed from film_category, film_actor and inventory 