package member;

import java.sql.Date;

public class Notice {

    private Integer NotNo;
    private Integer MemNo;
    private String NotContent;
    private Date NotTime;
    private Integer NotStat;

    public Integer getNotNo() {
        return NotNo;
    }

    public void setNotNo(Integer notNo) {
        NotNo = notNo;
    }

    public Integer getMemNo() {
        return MemNo;
    }

    public void setMemNo(Integer memNo) {
        MemNo = memNo;
    }

    public String getNotContent() {
        return NotContent;
    }

    public void setNotContent(String notContent) {
        NotContent = notContent;
    }

    public Date getNotTime() {
        return NotTime;
    }

    public void setNotTime(Date notTime) {
        NotTime = notTime;
    }

    public Integer getNotStat() {
        return NotStat;
    }

    public void setNotStat(Integer notStat) {
        NotStat = notStat;
    }
}
