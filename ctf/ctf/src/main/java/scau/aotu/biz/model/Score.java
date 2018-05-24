package scau.aotu.biz.model;

import java.util.Date;

public class Score {
    private Integer scoreId;

    private String userId;

    private String chalId;

    private String scoreType;

    private Integer score;

    private Date optTime;

    public Integer getScoreId() {
        return scoreId;
    }

    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
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

    public String getScoreType() {
        return scoreType;
    }

    public void setScoreType(String scoreType) {
        this.scoreType = scoreType == null ? null : scoreType.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getOptTime() {
        return optTime;
    }

    public void setOptTime(Date optTime) {
        this.optTime = optTime;
    }
}