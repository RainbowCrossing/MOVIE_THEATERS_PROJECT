/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author tyler
 */
@Entity
@Table(name = "THEATERSMOVIES")
@NamedQueries({
    @NamedQuery(name = "Theatersmovies.findAll", query = "SELECT t FROM Theatersmovies t"),
    @NamedQuery(name = "Theatersmovies.findByTheatersid", query = "SELECT t FROM Theatersmovies t WHERE t.theatersmoviesPK.theatersid = :theatersid"),
    @NamedQuery(name = "Theatersmovies.findByMoviesid", query = "SELECT t FROM Theatersmovies t WHERE t.theatersmoviesPK.moviesid = :moviesid")})
public class Theatersmovies implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TheatersmoviesPK theatersmoviesPK;

    public Theatersmovies() {
    }

    public Theatersmovies(TheatersmoviesPK theatersmoviesPK) {
        this.theatersmoviesPK = theatersmoviesPK;
    }

    public Theatersmovies(int theatersid, int moviesid) {
        this.theatersmoviesPK = new TheatersmoviesPK(theatersid, moviesid);
    }

    public TheatersmoviesPK getTheatersmoviesPK() {
        return theatersmoviesPK;
    }

    public void setTheatersmoviesPK(TheatersmoviesPK theatersmoviesPK) {
        this.theatersmoviesPK = theatersmoviesPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (theatersmoviesPK != null ? theatersmoviesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Theatersmovies)) {
            return false;
        }
        Theatersmovies other = (Theatersmovies) object;
        if ((this.theatersmoviesPK == null && other.theatersmoviesPK != null) || (this.theatersmoviesPK != null && !this.theatersmoviesPK.equals(other.theatersmoviesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Theatersmovies[ theatersmoviesPK=" + theatersmoviesPK + " ]";
    }
    
}
