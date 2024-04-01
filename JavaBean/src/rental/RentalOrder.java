package rental;

import java.sql.Date;

public class RentalOrder {

    private Integer rOrdNo;
    private Integer memNo;
    private String  rByrName;
    private String  rByrPhone;
    private String  rByrEmail;
    private String  rRcvName;
    private String  rRcvPhone;
    private Integer rTakeMethod;
    private String  rAddr;
    private Integer rPayMethod;
    private Double  rAllPrice;
    private Double  rAllDepPrice;
    private Date    rOrdTime;
    private Date    rDate;
    private Date    rBackDate;
    private Date    rRealBackDate;
    private Integer rPayStat;
    private Integer rOrdStat;
    private Integer rtnStat;
    private String  rtnRemark;
    private Double  rtnCompensation;

    public Integer getrOrdNo() {
        return rOrdNo;
    }

    public void setrOrdNo(Integer rOrdNo) {
        this.rOrdNo = rOrdNo;
    }

    public Integer getMemNo() {
        return memNo;
    }

    public void setMemNo(Integer memNo) {
        this.memNo = memNo;
    }

    public String getrByrName() {
        return rByrName;
    }

    public void setrByrName(String rByrName) {
        this.rByrName = rByrName;
    }

    public String getrByrPhone() {
        return rByrPhone;
    }

    public void setrByrPhone(String rByrPhone) {
        this.rByrPhone = rByrPhone;
    }

    public String getrByrEmail() {
        return rByrEmail;
    }

    public void setrByrEmail(String rByrEmail) {
        this.rByrEmail = rByrEmail;
    }

    public String getrRcvName() {
        return rRcvName;
    }

    public void setrRcvName(String rRcvName) {
        this.rRcvName = rRcvName;
    }

    public String getrRcvPhone() {
        return rRcvPhone;
    }

    public void setrRcvPhone(String rRcvPhone) {
        this.rRcvPhone = rRcvPhone;
    }

    public Integer getrTakeMethod() {
        return rTakeMethod;
    }

    public void setrTakeMethod(Integer rTakeMethod) {
        this.rTakeMethod = rTakeMethod;
    }

    public String getrAddr() {
        return rAddr;
    }

    public void setrAddr(String rAddr) {
        this.rAddr = rAddr;
    }

    public Integer getrPayMethod() {
        return rPayMethod;
    }

    public void setrPayMethod(Integer rPayMethod) {
        this.rPayMethod = rPayMethod;
    }

    public Double getrAllPrice() {
        return rAllPrice;
    }

    public void setrAllPrice(Double rAllPrice) {
        this.rAllPrice = rAllPrice;
    }

    public Double getrAllDepPrice() {
        return rAllDepPrice;
    }

    public void setrAllDepPrice(Double rAllDepPrice) {
        this.rAllDepPrice = rAllDepPrice;
    }

    public Date getrOrdTime() {
        return rOrdTime;
    }

    public void setrOrdTime(Date rOrdTime) {
        this.rOrdTime = rOrdTime;
    }

    public Date getrDate() {
        return rDate;
    }

    public void setrDate(Date rDate) {
        this.rDate = rDate;
    }

    public Date getrBackDate() {
        return rBackDate;
    }

    public void setrBackDate(Date rBackDate) {
        this.rBackDate = rBackDate;
    }

    public Date getrRealBackDate() {
        return rRealBackDate;
    }

    public void setrRealBackDate(Date rRealBackDate) {
        this.rRealBackDate = rRealBackDate;
    }

    public Integer getrPayStat() {
        return rPayStat;
    }

    public void setrPayStat(Integer rPayStat) {
        this.rPayStat = rPayStat;
    }

    public Integer getrOrdStat() {
        return rOrdStat;
    }

    public void setrOrdStat(Integer rOrdStat) {
        this.rOrdStat = rOrdStat;
    }

    public Integer getRtnStat() {
        return rtnStat;
    }

    public void setRtnStat(Integer rtnStat) {
        this.rtnStat = rtnStat;
    }

    public String getRtnRemark() {
        return rtnRemark;
    }

    public void setRtnRemark(String rtnRemark) {
        this.rtnRemark = rtnRemark;
    }

    public Double getRtnCompensation() {
        return rtnCompensation;
    }

    public void setRtnCompensation(Double rtnCompensation) {
        this.rtnCompensation = rtnCompensation;
    }
}