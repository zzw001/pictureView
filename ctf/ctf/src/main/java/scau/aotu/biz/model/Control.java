package scau.aotu.biz.model;

public class Control {
    private Integer ctlId;

    private Integer perId;

    private String ctlSource;

    public Integer getCtlId() {
        return ctlId;
    }

    public void setCtlId(Integer ctlId) {
        this.ctlId = ctlId;
    }

    public Integer getPerId() {
        return perId;
    }

    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    public String getCtlSource() {
        return ctlSource;
    }

    public void setCtlSource(String ctlSource) {
        this.ctlSource = ctlSource == null ? null : ctlSource.trim();
    }
}