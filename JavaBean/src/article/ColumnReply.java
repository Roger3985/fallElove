package article;

import java.sql.Date;

public class ColumnReply {

    private Integer ColumnReplyNo;
    private Integer ArtNo;
    private Integer MemNo;
    private String ComContent;
    private Date ComTime;
    private Integer ComStat;

    public Integer getColumnReplyNo() {
        return ColumnReplyNo;
    }

    public void setColumnReplyNo(Integer columnReplyNo) {
        ColumnReplyNo = columnReplyNo;
    }

    public Integer getArtNo() {
        return ArtNo;
    }

    public void setArtNo(Integer artNo) {
        ArtNo = artNo;
    }

    public Integer getMemNo() {
        return MemNo;
    }

    public void setMemNo(Integer memNo) {
        MemNo = memNo;
    }

    public String getComContent() {
        return ComContent;
    }

    public void setComContent(String comContent) {
        ComContent = comContent;
    }

    public Date getComTime() {
        return ComTime;
    }

    public void setComTime(Date comTime) {
        ComTime = comTime;
    }

    public Integer getComStat() {
        return ComStat;
    }

    public void setComStat(Integer comStat) {
        ComStat = comStat;
    }
}
