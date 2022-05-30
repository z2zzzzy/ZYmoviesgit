package com.zy.zymovies.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * 
 * @TableName t_want
 */
public class TWant implements Serializable {
    /**
     * 
     */
    private Integer want_id;

    /**
     * 
     */
    private Date date;

    /**
     * 
     */
    private Integer uid;
    private String mname;

    @Override
    public String toString() {
        return "TWant{" +
                "want_id=" + want_id +
                ", date=" + date +
                ", uid=" + uid +
                ", mname='" + mname + '\'' +
                ", mid=" + mid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TWant)) return false;

        TWant tWant = (TWant) o;

        if (want_id != null ? !want_id.equals(tWant.want_id) : tWant.want_id != null) return false;
        if (getDate() != null ? !getDate().equals(tWant.getDate()) : tWant.getDate() != null) return false;
        if (getUid() != null ? !getUid().equals(tWant.getUid()) : tWant.getUid() != null) return false;
        if (getMname() != null ? !getMname().equals(tWant.getMname()) : tWant.getMname() != null) return false;
        return getMid() != null ? getMid().equals(tWant.getMid()) : tWant.getMid() == null;
    }

    @Override
    public int hashCode() {
        int result = want_id != null ? want_id.hashCode() : 0;
        result = 31 * result + (getDate() != null ? getDate().hashCode() : 0);
        result = 31 * result + (getUid() != null ? getUid().hashCode() : 0);
        result = 31 * result + (getMname() != null ? getMname().hashCode() : 0);
        result = 31 * result + (getMid() != null ? getMid().hashCode() : 0);
        return result;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    /**
     * 
     */
    private Integer mid;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getWantId() {
        return want_id;
    }

    /**
     * 
     */
    public void setWantId(Integer wantId) {
        this.want_id = wantId;
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
    public Integer getUid() {
        return uid;
    }

    /**
     * 
     */
    public void setUid(Integer uid) {
        this.uid = uid;
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

}