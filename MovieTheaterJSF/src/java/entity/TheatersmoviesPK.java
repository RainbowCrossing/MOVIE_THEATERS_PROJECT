/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author tyler
 */
@Embeddable
public class TheatersmoviesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "THEATERSID")
    private int theatersid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOVIESID")
    private int moviesid;

    public TheatersmoviesPK() {
    }

    public TheatersmoviesPK(int theatersid, int moviesid) {
        this.theatersid = theatersid;
        this.moviesid = moviesid;
    }

    public int getTheatersid() {
        return theatersid;
    }

    public void setTheatersid(int theatersid) {
        this.theatersid = theatersid;
    }

    public int getMoviesid() {
        return moviesid;
    }

    public void setMoviesid(int moviesid) {
        this.moviesid = moviesid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) theatersid;
        hash += (int) moviesid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TheatersmoviesPK)) {
            return false;
        }
        TheatersmoviesPK other = (TheatersmoviesPK) object;
        if (this.theatersid != other.theatersid) {
            return false;
        }
        if (this.moviesid != other.moviesid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TheatersmoviesPK[ theatersid=" + theatersid + ", moviesid=" + moviesid + " ]";
    }
    
}
