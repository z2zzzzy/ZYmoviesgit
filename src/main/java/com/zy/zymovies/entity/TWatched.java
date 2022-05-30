package com.zy.zymovies.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * 
 * @TableName t_watched
 */
public class TWatched implements Serializable {
    /**
     * 
     */
    private Integer watchedid;
    private String mname;

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    /**
     * 
     */
    private Date date;

    /**
     * 
     */
    private Integer myrate;

    @Override
    public String toString() {
        return "TWatched{" +
                "watchedid=" + watchedid +
                ", mname='" + mname + '\'' +
                ", date=" + date +
                ", myrate=" + myrate +
                ", mid=" + mid +
                ", uid=" + uid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TWatched)) return false;

        TWatched tWatched = (TWatched) o;

        if (getWatchedid() != null ? !getWatchedid().equals(tWatched.getWatchedid()) : tWatched.getWatchedid() != null)
            return false;
        if (getMname() != null ? !getMname().equals(tWatched.getMname()) : tWatched.getMname() != null) return false;
        if (getDate() != null ? !getDate().equals(tWatched.getDate()) : tWatched.getDate() != null) return false;
        if (getMyrate() != null ? !getMyrate().equals(tWatched.getMyrate()) : tWatched.getMyrate() != null)
            return false;
        if (getMid() != null ? !getMid().equals(tWatched.getMid()) : tWatched.getMid() != null) return false;
        return getUid() != null ? getUid().equals(tWatched.getUid()) : tWatched.getUid() == null;
    }

    @Override
    public int hashCode() {
        int result = getWatchedid() != null ? getWatchedid().hashCode() : 0;
        result = 31 * result + (getMname() != null ? getMname().hashCode() : 0);
        result = 31 * result + (getDate() != null ? getDate().hashCode() : 0);
        result = 31 * result + (getMyrate() != null ? getMyrate().hashCode() : 0);
        result = 31 * result + (getMid() != null ? getMid().hashCode() : 0);
        result = 31 * result + (getUid() != null ? getUid().hashCode() : 0);
        return result;
    }

    /**
     * 
     */
    private Integer mid;

    /**
     * 
     */
    private Integer uid;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getWatchedid() {
        return watchedid;
    }

    /**
     * 
     */
    public void setWatchedid(Integer watchedid) {
        this.watchedid = watchedid;
    }

    /**
     * 
     */
    public Date getDate() {
        return date;
    }

    /**
     * 
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 
     */
    public Integer getMyrate() {
        return myrate;
    }

    /**
     * 
     */
    public void setMyrate(Integer myrate) {
        this.myrate = myrate;
    }

    /**
     * 
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * 
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    /**
     * 
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

}