/*
 * TMW160530 Tyler Waller
 * This program is meant to simulate the process of a movie ticket purchase
 * through a JSF page being able to pull information from the moviesDB that was
 * created for this project. It should be able to simulate the process of inputting
 * a zipcode, locating a nearby theater, list the shows at the theater, and then walk
 * through the process of purchasing a ticket with some validations in between the process.
 */
package bean;

import ejb.MovieTheatersEJB;
import entity.Movies;
import entity.Theaters;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author tyler
 */
@Named(value = "moviesBean")
@SessionScoped
public class MoviesBean implements Serializable {
    // EJB and variables.
    @EJB
    private MovieTheatersEJB movieTheatersEJB;
    private Movies movies;
    private Theaters theaters;

    public MoviesBean() {
    }
    // Getters and setters.
    public Movies getMovies() {
        return movies;
    }

    public void setMovies(Movies movies) {
        this.movies = movies;
    }

    public Theaters getTheaters() {
        return theaters;
    }

    public void setTheaters(Theaters theaters) {
        this.theaters = theaters;
    }
    // Movies functions calls for lists and then proceeding to 
    // the corresponding page.
    public String showMovies() {
        try {
            FacesContext fc = FacesContext.getCurrentInstance();
            Map<String,String> params = fc.getExternalContext().getRequestParameterMap();
            int theatersid = Integer.parseInt(params.get("theatersid"));
            theaters = movieTheatersEJB.getTheatersId(theatersid);
            return "Movie.xhtml";
        } catch (Exception e) {
            return "Error with showing movies.";
        }
    }
    
    public List<Movies> getMovieList() {
        if(theaters != null) {
            return movieTheatersEJB.getMovie(theaters.getTheatersid());
        }
        else
            return null;
    }
}
