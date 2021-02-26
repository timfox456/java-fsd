# Capstone Project

This is the capstone project for the Java FSD.

A link to the original PDF (with pictures) is [here](./doc/capstone.pdf).

## Developing Online Music Store

### Background of the problem statement:
1. An online product catalog that can be browsed: The work starts with adding many new product catalog features which includes displaying categories, products, and product details.

2. Searching the Catalog: For the visual part, a text box is used in which the visitor can enter one or more words to search through the product catalog. In Music CD Shop, the words entered by the visitor are searched for in the products’ names and descriptions. Also, the user can search for a particular song by entering the title, artist, style, format and the price range.

3. A Custom Shopping Cart and checkout: A custom shopping basket is implemented, which stores its data into the local database. Also a “shopping cart summary control” is created that shows up in every catalog page except the shopping cart page.

4.  Handling Customer Accounts: In customer account system, details such as credit card numbers are stored in a database so that customers don’t have to retype this information each time they place an order. Customers can log in via a login page or dialog box to get access to secured areas of the web site. Once logged in, the Web Application remembers the customer until the customer logs out (either manually via a Log Out button or automatically, if the session times out or a server error occurs). All secure pages in a Web Application need to check whether a customer is logged in before allowing access.

5. Catalog Administration: This administrative interface is implemented for easy management of the web store data. The catalog administration page allows the administrator to:

 * Add or remove genres, and update the details of existing genres
 * View and manage the categories that belong to a genre
 * Manage the list of products in a specific category, and edit product details 
 * Assign an existing product to an additional, or move it to another category 
 * Remove a product from a category or delete the product from the catalog 
 * Manage orders by updating their status

### Recommended technologies:

Any technologies or frameworks are acceptable for your project, although the backand should be part of the java ecosystem.  Any
dependency or API which you feel may be helpful is fine to use, provided you have the legal right to use it.

These are merely suggestions and not necessarily a requirement for using them. 

On the front end, frameworks like bootstrap, angular, react, jquery, etc are all acceptable (and encouraged) to use.

1. Spring boot
2. Java8
3. H2 database
4. Spring Data JPA
5. JSP
6. Servlets
7. Bootstrap


### Notes

Here is some of the SQL That I used to pre-load some data.

```sql
insert into genre (id, name) VALUES (1, "Country");
insert into genre (id, name) VALUES (2, "Pop");
insert into album (id, name, artist, price, release_date, genre_id) VALUES (1, "Going With My Tractor", "Tim McGraw", 9.99, '2020-01-01', 1);
insert into album (id, name, artist, price, release_date, genre_id) VALUES (2, "Traveler", "Chris Stapleton", 9.99, '2020-01-01', 2);
insert into music (id, name, price, track_number, album_id) VALUES (1, "My Tractor is Awesome", 0.99, 1, 1);
insert into music (id, name, price, track_number, album_id) VALUES (1, "Starting Over", 0.99, 1, 2);
```
