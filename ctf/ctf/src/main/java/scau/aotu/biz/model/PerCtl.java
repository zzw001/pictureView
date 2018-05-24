package scau.aotu.biz.model;

public class PerCtl {
    private Integer perCtlId;

    private String perId;

    private String ctl;

    public Integer getPerCtlId() {
        return perCtlId;
    }

    public void setPerCtlId(Integer perCtlId) {
        this.perCtlId = perCtlId;
    }

    public String getPerId() {
        return perId;
    }

    public void setPerId(String perId) {
        this.perId = perId == null ? null : perId.trim();
    }

    public String getCtl() {
        return ctl;
    }

    public void setCtl(String ctl) {
        this.ctl = ctl == null ? null : ctl.trim();
    }
}