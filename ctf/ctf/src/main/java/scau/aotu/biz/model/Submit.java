package scau.aotu.biz.model;

import java.util.Date;

public class Submit {
    private Integer subId;

    private String userId;

    private String chalId;

    private Integer subState;

    private String subFlag;

    private Date subTime;

    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getChalId() {
        return chalId;
    }

    public void setChalId(String chalId) {
        this.chalId = chalId == null ? null : chalId.trim();
    }

    public Integer getSubState() {
        return subState;
    }

    public void setSubState(Integer subState) {
        this.subState = subState;
    }

    public String getSubFlag() {
        return subFlag;
    }

    public void setSubFlag(String subFlag) {
        this.subFlag = subFlag == null ? null : subFlag.trim();
    }

    public Date getSubTime() {
        return subTime;
    }

    public void setSubTime(Date subTime) {
        this.subTime = subTime;
    }
}