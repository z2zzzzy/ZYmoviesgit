package com.zy.zymovies.entity;

import java.io.Serializable;
import java.sql.Date;

public class Movie implements Serializable {
    private Integer mid;
    private String mname;
    private String director;
    private String type;
    private Date date;
    private Integer rate;
    private String country;
    private String image;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;

        Movie movie = (Movie) o;

        if (getMid() != null ? !getMid().equals(movie.getMid()) : movie.getMid() != null) return false;
        if (getMname() != null ? !getMname().equals(movie.getMname()) : movie.getMname() != null) return false;
        if (getDirector() != null ? !getDirector().equals(movie.getDirector()) : movie.getDirector() != null)
            return false;
        if (getType() != null ? !getType().equals(movie.getType()) : movie.getType() != null) return false;
        if (getDate() != null ? !getDate().equals(movie.getDate()) : movie.getDate() != null) return false;
        if (getRate() != null ? !getRate().equals(movie.getRate()) : movie.getRate() != null) return false;
        if (getCountry() != null ? !getCountry().equals(movie.getCountry()) : movie.getCountry() != null) return false;
        return getImage() != null ? getImage().equals(movie.getImage()) : movie.getImage() == null;
    }

    @Override
    public int hashCode() {
        int result = getMid() != null ? getMid().hashCode() : 0;
        result = 31 * result + (getMname() != null ? getMname().hashCode() : 0);
        result = 31 * result + (getDirector() != null ? getDirector().hashCode() : 0);
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (getDate() != null ? getDate().hashCode() : 0);
        result = 31 * result + (getRate() != null ? getRate().hashCode() : 0);
        result = 31 * result + (getCountry() != null ? getCountry().hashCode() : 0);
        result = 31 * result + (getImage() != null ? getImage().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", director='" + director + '\'' +
                ", type='" + type + '\'' +
                ", date=" + date +
                ", rate=" + rate +
                ", country='" + country + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
