package scau.aotu.biz.model;

public class Hint {
    private Integer hintId;

    private String chalId;

    private String hintDesc;

    private Integer hintCost;

    public Integer getHintId() {
        return hintId;
    }

    public void setHintId(Integer hintId) {
        this.hintId = hintId;
    }

    public String getChalId() {
        return chalId;
    }

    public void setChalId(String chalId) {
        this.chalId = chalId == null ? null : chalId.trim();
    }

    public String getHintDesc() {
        return hintDesc;
    }

    public void setHintDesc(String hintDesc) {
        this.hintDesc = hintDesc == null ? null : hintDesc.trim();
    }

    public Integer getHintCost() {
        return hintCost;
    }

    public void setHintCost(Integer hintCost) {
        this.hintCost = hintCost;
    }
}