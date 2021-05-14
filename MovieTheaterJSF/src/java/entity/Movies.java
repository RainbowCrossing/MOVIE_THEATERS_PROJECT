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
@Table(name = "MOVIES")
@NamedQueries({
    @NamedQuery(name = "Movies.findAll", query = "SELECT m FROM Movies m"),
    @NamedQuery(name = "Movies.findByMoviesid", query = "SELECT m FROM Movies m WHERE m.moviesid = :moviesid"),
    @NamedQuery(name = "Movies.findByTitle", query = "SELECT m FROM Movies m WHERE m.title = :title"),
    @NamedQuery(name = "Movies.findByDescription", query = "SELECT m FROM Movies m WHERE m.description = :description"),
    @NamedQuery(name = "Movies.findByDuartion", query = "SELECT m FROM Movies m WHERE m.duartion = :duartion"),
    @NamedQuery(name = "Movies.findByPoster", query = "SELECT m FROM Movies m WHERE m.poster = :poster"),
    @NamedQuery(name = "Movies.findByTime1", query = "SELECT m FROM Movies m WHERE m.time1 = :time1"),
    @NamedQuery(name = "Movies.findByTime2", query = "SELECT m FROM Movies m WHERE m.time2 = :time2"),
    @NamedQuery(name = "Movies.findByTime3", query = "SELECT m FROM Movies m WHERE m.time3 = :time3"),
    @NamedQuery(name = "Movies.findByTime4", query = "SELECT m FROM Movies m WHERE m.time4 = :time4"),
    @NamedQuery(name = "Movies.findByTime5", query = "SELECT m FROM Movies m WHERE m.time5 = :time5")})
public class Movies implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOVIESID")
    private Integer moviesid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TITLE")
    private String title;
    @Size(max = 1000)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 10)
    @Column(name = "DUARTION")
    private String duartion;
    @Size(max = 200)
    @Column(name = "POSTER")
    private String poster;
    @Size(max = 10)
    @Column(name = "TIME1")
    private String time1;
    @Size(max = 10)
    @Column(name = "TIME2")
    private String time2;
    @Size(max = 10)
    @Column(name = "TIME3")
    private String time3;
    @Size(max = 10)
    @Column(name = "TIME4")
    private String time4;
    @Size(max = 10)
    @Column(name = "TIME5")
    private String time5;

    public Movies() {
    }

    public Movies(Integer moviesid) {
        this.moviesid = moviesid;
    }

    public Movies(Integer moviesid, String title) {
        this.moviesid = moviesid;
        this.title = title;
    }

    public Integer getMoviesid() {
        return moviesid;
    }

    public void setMoviesid(Integer moviesid) {
        this.moviesid = moviesid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuartion() {
        return duartion;
    }

    public void setDuartion(String duartion) {
        this.duartion = duartion;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public String getTime3() {
        return time3;
    }

    public void setTime3(String time3) {
        this.time3 = time3;
    }

    public String getTime4() {
        return time4;
    }

    public void setTime4(String time4) {
        this.time4 = time4;
    }

    public String getTime5() {
        return time5;
    }

    public void setTime5(String time5) {
        this.time5 = time5;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (moviesid != null ? moviesid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movies)) {
            return false;
        }
        Movies other = (Movies) object;
        if ((this.moviesid == null && other.moviesid != null) || (this.moviesid != null && !this.moviesid.equals(other.moviesid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Movies[ moviesid=" + moviesid + " ]";
    }
    
}
