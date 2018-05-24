package scau.aotu.biz.model;

import java.util.Date;

public class Maintenance {
    private Integer mateId;

    private String chalId;

    private String matestaffId;

    private Integer mateState;

    private Date mateTime;

    public Integer getMateId() {
        return mateId;
    }

    public void setMateId(Integer mateId) {
        this.mateId = mateId;
    }

    public String getChalId() {
        return chalId;
    }

    public void setChalId(String chalId) {
        this.chalId = chalId == null ? null : chalId.trim();
    }

    public String getMatestaffId() {
        return matestaffId;
    }

    public void setMatestaffId(String matestaffId) {
        this.matestaffId = matestaffId == null ? null : matestaffId.trim();
    }

    public Integer getMateState() {
        return mateState;
    }

    public void setMateState(Integer mateState) {
        this.mateState = mateState;
    }

    public Date getMateTime() {
        return mateTime;
    }

    public void setMateTime(Date mateTime) {
        this.mateTime = mateTime;
    }
}