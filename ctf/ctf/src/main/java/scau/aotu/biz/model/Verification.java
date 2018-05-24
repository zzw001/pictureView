package scau.aotu.biz.model;

import java.util.Date;

public class Verification {
    private Integer veriId;

    private String chalId;

    private String verifitorId;

    private Integer verifyState;

    private String verifyDesc;

    private Date verifyTime;

    public Integer getVeriId() {
        return veriId;
    }

    public void setVeriId(Integer veriId) {
        this.veriId = veriId;
    }

    public String getChalId() {
        return chalId;
    }

    public void setChalId(String chalId) {
        this.chalId = chalId == null ? null : chalId.trim();
    }

    public String getVerifitorId() {
        return verifitorId;
    }

    public void setVerifitorId(String verifitorId) {
        this.verifitorId = verifitorId == null ? null : verifitorId.trim();
    }

    public Integer getVerifyState() {
        return verifyState;
    }

    public void setVerifyState(Integer verifyState) {
        this.verifyState = verifyState;
    }

    public String getVerifyDesc() {
        return verifyDesc;
    }

    public void setVerifyDesc(String verifyDesc) {
        this.verifyDesc = verifyDesc == null ? null : verifyDesc.trim();
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }
}