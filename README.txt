/*
 * Tyler Waller
 * This program is meant to simulate the process of a movie ticket purchase
 * through a JSF page being able to pull information from the moviesDB that was
 * created for this project. It should be able to simulate the process of inputting
 * a zipcode, locating a nearby theater, list the shows at the theater, and then walk
 * through the process of purchasing a ticket with some validations in between the process.
 */

JSF PAGES:
MainPage.xhtml - Main page to enter in zipcode to pull up theater. (Unfortunately I was having trouble getting multiple theaters to one zip code
instead it was just listing them all instead.)

Theaters.xhtml - Theaters page meant to list theaters and be able to pick and choose one to look at the showings.

Movie.xhtml - This page showed the movies that were showing at the selected theater, with the times.

Purchase.xhtml - This page led to s ingle movie that you choose and give a description along with the option to get to a purchase for ticket(s).

PaymentInfo.xhtml - This page was created to get information from the user for payment: credit card number, name, and etc. to be able to relay
the information and get total costs.

Confirmation.xhtml - This page was a confirmation page of your payment, showing totals and time that your movie is showing that you selected.

CDI BEANS:
MainPageBean.java - This bean was the main bean to grab the theaters from the moviesDB that was created to display to the user when called.

MoviesBean.java - This bean handles the execution of grabbing the movies from the DB associated with the theater that was selected.

PurchaseBean.java - This bean was mainly handling the rest of the purchase function for tickets, leading the user from one page to the next and
getting the info needed for the purchase.

EJB:
MovieTheatersEJB.java - This ejb was what handled all the call requests to the moviesDB to get the information needed for the specific call.

ENITITIES:
All entities were pulled from the moviesDB.

MOVIESDB:
The database I had created was moviesDB, which holds the information for the theaters and movies. SQL file should be attached.
((ZIPCODES USED FOR TESTING: 
	75067,
	76262,
	76051,
	75022,	
	75056))




