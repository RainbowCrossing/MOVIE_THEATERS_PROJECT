/*
 * Tyler Waller
 * This program is meant to simulate the process of a movie ticket purchase
 * through a JSF page being able to pull information from the moviesDB that was
 * created for this project. It should be able to simulate the process of inputting
 * a zipcode, locating a nearby theater, list the shows at the theater, and then walk
 * through the process of purchasing a ticket with some validations in between the process.
 */
package bean;

import ejb.MovieTheatersEJB;
import entity.Movies;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author tyler
 */
@Named(value = "purchaseBean")
@SessionScoped
public class PurchaseBean implements Serializable {
    // EJB and variables.
    @EJB
    private MovieTheatersEJB movieTheatersEJB;
    private Movies movie;
    private int tickets;
    private String creditCardNumber;
    private String cardName;
    private String expDate;
    private String movieTime;
    private double ticketsCost;

    public PurchaseBean() {
    }
    // Setters and getters.
    public Movies getMovies() {
        return movie;
    }

    public void setMovies(Movies movie) {
        this.movie = movie;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(String movieTime) {
        this.movieTime = movieTime;
    }
    // Function for tickets cost at a set price.
    public double getTicketsCost() {
        ticketsCost = tickets * 10;
        return ticketsCost;
    }

    public void setTicketsCost(double ticketsCost) {
        this.ticketsCost = ticketsCost;
    }
    
    // When buttons are clicked, show respective page.
    // buyTickets is meant to keep the movie that was picked
    // and follow up with a display of that movie to proceed
    // to purchasing ticket(s).
    public String buyTickets(Movies movie) {
        this.movie = movie;
        return "Purchase.xhtml";
    }
    
    public String payment() {
        return "PaymentInfo.xhtml";
    }
    
    public String confirm() {
        return "Confirmation.xhtml";
    }
}
