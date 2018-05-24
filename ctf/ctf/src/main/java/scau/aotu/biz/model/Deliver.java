package scau.aotu.biz.model;

import java.util.Date;

public class Deliver {
    private Integer deliId;

    private String chalId;

    private String authorId;

    private Date deliTime;

    public Integer getDeliId() {
        return deliId;
    }

    public void setDeliId(Integer deliId) {
        this.deliId = deliId;
    }

    public String getChalId() {
        return chalId;
    }

    public void setChalId(String chalId) {
        this.chalId = chalId == null ? null : chalId.trim();
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId == null ? null : authorId.trim();
    }

    public Date getDeliTime() {
        return deliTime;
    }

    public void setDeliTime(Date deliTime) {
        this.deliTime = deliTime;
    }
}