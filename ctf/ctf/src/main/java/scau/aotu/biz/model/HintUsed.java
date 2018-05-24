package scau.aotu.biz.model;

import java.util.Date;

public class HintUsed {
    private Integer hintUsedId;

    private String userId;

    private String chalId;

    private Integer hintId;

    private Date usedTime;

    public Integer getHintUsedId() {
        return hintUsedId;
    }

    public void setHintUsedId(Integer hintUsedId) {
        this.hintUsedId = hintUsedId;
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

    public Integer getHintId() {
        return hintId;
    }

    public void setHintId(Integer hintId) {
        this.hintId = hintId;
    }

    public Date getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(Date usedTime) {
        this.usedTime = usedTime;
    }
}