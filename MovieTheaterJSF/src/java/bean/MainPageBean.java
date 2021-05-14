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
import entity.Theaters;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author tyler
 */
@Named(value = "mainPageBean")
@RequestScoped
public class MainPageBean implements Serializable{
    // EJB and variables.
    @EJB
    private MovieTheatersEJB movieTheatersEJB;
    private Theaters theaters;
    private String zipCodes;

    public MainPageBean() {
    }
    // Getters and setters.
    public Theaters getTheater() {
        return theaters;
    }

    public void setTheater(Theaters theater) {
        this.theaters = theater;
    }

    public String getZipCodes() {
        return zipCodes;
    }

    public void setZipCodes(String zipCodes) {
        this.zipCodes = zipCodes;
    }
    // Functions for theaters to be shown when looked up.
    public List<Theaters> getTheatersList() {
        return movieTheatersEJB.findAllTheaters();
    }
    
    public String showTheaters() {
        try {
            theaters = movieTheatersEJB.getTheater(zipCodes);
            return "Theaters.xhtml";
        } catch (Exception e) {
            return "No theaters found.";
        }
    }
}
