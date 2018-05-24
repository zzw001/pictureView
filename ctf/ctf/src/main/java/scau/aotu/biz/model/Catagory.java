package scau.aotu.biz.model;

public class Catagory {
    private Integer cataId;

    private String cataName;

    private String cataDesc;

    public Integer getCataId() {
        return cataId;
    }

    public void setCataId(Integer cataId) {
        this.cataId = cataId;
    }

    public String getCataName() {
        return cataName;
    }

    public void setCataName(String cataName) {
        this.cataName = cataName == null ? null : cataName.trim();
    }

    public String getCataDesc() {
        return cataDesc;
    }

    public void setCataDesc(String cataDesc) {
        this.cataDesc = cataDesc == null ? null : cataDesc.trim();
    }
}