/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author tyler
 */
@Entity
@Table(name = "THEATERS")
@NamedQueries({
    @NamedQuery(name = "Theaters.findAll", query = "SELECT t FROM Theaters t"),
    @NamedQuery(name = "Theaters.findByTheatersid", query = "SELECT t FROM Theaters t WHERE t.theatersid = :theatersid"),
    @NamedQuery(name = "Theaters.findByTheatername", query = "SELECT t FROM Theaters t WHERE t.theatername = :theatername"),
    @NamedQuery(name = "Theaters.findByAddress", query = "SELECT t FROM Theaters t WHERE t.address = :address"),
    @NamedQuery(name = "Theaters.findByCity", query = "SELECT t FROM Theaters t WHERE t.city = :city"),
    @NamedQuery(name = "Theaters.findByStates", query = "SELECT t FROM Theaters t WHERE t.states = :states"),
    @NamedQuery(name = "Theaters.findByZipcode", query = "SELECT t FROM Theaters t WHERE t.zipcode = :zipcode"),
    @NamedQuery(name = "Theaters.findMovies", query = "SELECT m FROM Movies m, Theatersmovies t WHERE m.moviesid = t.theatersmoviesPK.moviesid and t.theatersmoviesPK.theatersid =:theatersid")})
public class Theaters implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "THEATERSID")
    private Integer theatersid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "THEATERNAME")
    private String theatername;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ADDRESS")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CITY")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "STATES")
    private String states;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ZIPCODE")
    private String zipcode;

    public Theaters() {
    }

    public Theaters(Integer theatersid) {
        this.theatersid = theatersid;
    }

    public Theaters(Integer theatersid, String theatername, String address, String city, String states, String zipcode) {
        this.theatersid = theatersid;
        this.theatername = theatername;
        this.address = address;
        this.city = city;
        this.states = states;
        this.zipcode = zipcode;
    }

    public Integer getTheatersid() {
        return theatersid;
    }

    public void setTheatersid(Integer theatersid) {
        this.theatersid = theatersid;
    }

    public String getTheatername() {
        return theatername;
    }

    public void setTheatername(String theatername) {
        this.theatername = theatername;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (theatersid != null ? theatersid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Theaters)) {
            return false;
        }
        Theaters other = (Theaters) object;
        if ((this.theatersid == null && other.theatersid != null) || (this.theatersid != null && !this.theatersid.equals(other.theatersid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Theaters[ theatersid=" + theatersid + " ]";
    }
    
}
