package article;

import java.sql.Date;

public class Report {

    private Integer ReportNo;
    private Integer ArtReplyNo;
    private Integer MemNo;
    private Integer AdmNo;
    private Date ReportTime;
    private String ReportReason;
    private Integer ReportType;

    public Integer getReportNo() {
        return ReportNo;
    }

    public void setReportNo(Integer reportNo) {
        ReportNo = reportNo;
    }

    public Integer getArtReplyNo() {
        return ArtReplyNo;
    }

    public void setArtReplyNo(Integer artReplyNo) {
        ArtReplyNo = artReplyNo;
    }

    public Integer getMemNo() {
        return MemNo;
    }

    public void setMemNo(Integer memNo) {
        MemNo = memNo;
    }

    public Integer getAdmNo() {
        return AdmNo;
    }

    public void setAdmNo(Integer admNo) {
        AdmNo = admNo;
    }

    public Date getReportTime() {
        return ReportTime;
    }

    public void setReportTime(Date reportTime) {
        ReportTime = reportTime;
    }

    public String getReportReason() {
        return ReportReason;
    }

    public void setReportReason(String reportReason) {
        ReportReason = reportReason;
    }

    public Integer getReportType() {
        return ReportType;
    }

    public void setReportType(Integer reportType) {
        ReportType = reportType;
    }
}
