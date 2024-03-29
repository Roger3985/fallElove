package article;

import java.sql.Date;

public class ColumnArticle {

    private Integer ArtNo;
    private Integer AdmNo;
    private String ArtTitle;
    private String ArtContent;
    private Date ArtTime;
    private Integer ArtCatNo;
    private Integer ArtStat;

    public Integer getArtNo() {
        return ArtNo;
    }

    public void setArtNo(Integer artNo) {
        ArtNo = artNo;
    }

    public Integer getAdmNo() {
        return AdmNo;
    }

    public void setAdmNo(Integer admNo) {
        AdmNo = admNo;
    }

    public String getArtTitle() {
        return ArtTitle;
    }

    public void setArtTitle(String artTitle) {
        ArtTitle = artTitle;
    }

    public String getArtContent() {
        return ArtContent;
    }

    public void setArtContent(String artContent) {
        ArtContent = artContent;
    }

    public Date getArtTime() {
        return ArtTime;
    }

    public void setArtTime(Date artTime) {
        ArtTime = artTime;
    }

    public Integer getArtCatNo() {
        return ArtCatNo;
    }

    public void setArtCatNo(Integer artCatNo) {
        ArtCatNo = artCatNo;
    }

    public Integer getArtStat() {
        return ArtStat;
    }

    public void setArtStat(Integer artStat) {
        ArtStat = artStat;
    }
}
