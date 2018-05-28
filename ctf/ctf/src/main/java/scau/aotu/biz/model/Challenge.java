package scau.aotu.biz.model;

public class Challenge {
    private String chalId;

    private String chalName;

    private String chalDesc;

    private Integer cateId;

    private String flag;

    private Integer chalScore;

    private String chalSource;

    private String chalPoint;

    private String writeup;

    private Integer showState;

    private String authorId;

    private String verifitorId;

    private Integer verifyState;

    public String getChalId() {
        return chalId;
    }

    public void setChalId(String chalId) {
        this.chalId = chalId == null ? null : chalId.trim();
    }

    public String getChalName() {
        return chalName;
    }

    public void setChalName(String chalName) {
        this.chalName = chalName == null ? null : chalName.trim();
    }

    public String getChalDesc() {
        return chalDesc;
    }

    public void setChalDesc(String chalDesc) {
        this.chalDesc = chalDesc == null ? null : chalDesc.trim();
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public Integer getChalScore() {
        return chalScore;
    }

    public void setChalScore(Integer chalScore) {
        this.chalScore = chalScore;
    }

    public String getChalSource() {
        return chalSource;
    }

    public void setChalSource(String chalSource) {
        this.chalSource = chalSource == null ? null : chalSource.trim();
    }

    public String getChalPoint() {
        return chalPoint;
    }

    public void setChalPoint(String chalPoint) {
        this.chalPoint = chalPoint == null ? null : chalPoint.trim();
    }

    public String getWriteup() {
        return writeup;
    }

    public void setWriteup(String writeup) {
        this.writeup = writeup == null ? null : writeup.trim();
    }

    public Integer getShowState() {
        return showState;
    }

    public void setShowState(Integer showState) {
        this.showState = showState;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId == null ? null : authorId.trim();
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

    @Override
    public String toString() {
        return "Challenge{" +
                "chalId='" + chalId + '\'' +
                ", chalName='" + chalName + '\'' +
                ", chalDesc='" + chalDesc + '\'' +
                ", cateId=" + cateId +
                ", flag='" + flag + '\'' +
                ", chalScore=" + chalScore +
                ", chalSource='" + chalSource + '\'' +
                ", chalPoint='" + chalPoint + '\'' +
                ", writeup='" + writeup + '\'' +
                ", showState=" + showState +
                ", authorId='" + authorId + '\'' +
                ", verifitorId='" + verifitorId + '\'' +
                ", verifyState=" + verifyState +
                '}';
    }
}