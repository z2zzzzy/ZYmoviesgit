package com.zy.zymovies.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * 
 * @TableName t_comment
 */
public class TComment implements Serializable {
    /**
     * 
     */
    private Integer cid;
    private String mname;
    private String uname;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public String toString() {
        return "TComment{" +
                "cid=" + cid +
                ", mname='" + mname + '\'' +
                ", uname='" + uname + '\'' +
                ", uid=" + uid +
                ", mid=" + mid +
                ", content='" + content + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TComment)) return false;

        TComment tComment = (TComment) o;

        if (getCid() != null ? !getCid().equals(tComment.getCid()) : tComment.getCid() != null) return false;
        if (getMname() != null ? !getMname().equals(tComment.getMname()) : tComment.getMname() != null) return false;
        if (getUname() != null ? !getUname().equals(tComment.getUname()) : tComment.getUname() != null) return false;
        if (getUid() != null ? !getUid().equals(tComment.getUid()) : tComment.getUid() != null) return false;
        if (getMid() != null ? !getMid().equals(tComment.getMid()) : tComment.getMid() != null) return false;
        if (getContent() != null ? !getContent().equals(tComment.getContent()) : tComment.getContent() != null)
            return false;
        return getDate() != null ? getDate().equals(tComment.getDate()) : tComment.getDate() == null;
    }

    @Override
    public int hashCode() {
        int result = getCid() != null ? getCid().hashCode() : 0;
        result = 31 * result + (getMname() != null ? getMname().hashCode() : 0);
        result = 31 * result + (getUname() != null ? getUname().hashCode() : 0);
        result = 31 * result + (getUid() != null ? getUid().hashCode() : 0);
        result = 31 * result + (getMid() != null ? getMid().hashCode() : 0);
        result = 31 * result + (getContent() != null ? getContent().hashCode() : 0);
        result = 31 * result + (getDate() != null ? getDate().hashCode() : 0);
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
    private Integer uid;

    /**
     * 
     */
    private Integer mid;

    /**
     * 
     */
    private String content;

    /**
     * 
     */
    private Date date;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 
     */
    public void setCid(Integer cid) {
        this.cid = cid;
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

    /**
     * 
     */
    public String getContent() {
        return content;
    }

    /**
     * 
     */
    public void setContent(String content) {
        this.content = content;
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

}