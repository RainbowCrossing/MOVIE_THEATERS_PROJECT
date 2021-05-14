/*
 * TMW160530 Tyler Waller
 * This program is meant to simulate the process of a movie ticket purchase
 * through a JSF page being able to pull information from the moviesDB that was
 * created for this project. It should be able to simulate the process of inputting
 * a zipcode, locating a nearby theater, list the shows at the theater, and then walk
 * through the process of purchasing a ticket with some validations in between the process.
 * 
 */
package ejb;

import entity.Movies;
import entity.Theaters;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tyler
 */
@Stateless
public class MovieTheatersEJB {
    // Persistence unit created.
    @PersistenceContext(unitName = "MovieTheaterJSFPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }
    // These functions were created to be able to get results whether through
    //  a list or a single result when searching for theaters and looking
    // for movies.
    public List<Theaters> findAllTheaters() {
        return em.createNamedQuery("Theaters.findAll", Theaters.class).getResultList();
    }
    
    public Theaters getTheater(String zipcode) {
        return em.createNamedQuery("Theaters.findByZipcode", Theaters.class).setParameter("zipcode", zipcode).getSingleResult();
    }
    
    public Theaters getTheatersId(int theatersid) {
        return em.createNamedQuery("Theaters.findByTheatersid", Theaters.class).setParameter("theatersid", theatersid).getSingleResult();
    }
    
    public List<Movies> getMovie(int theatersID) {
        return em.createNamedQuery("Theaters.findMovies", Movies.class).setParameter("theatersid", theatersID).getResultList();
    }
}
