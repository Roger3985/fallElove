package rental;

import java.sql.Date;

public class RentalMyTrack {

    private Integer rNo;
    private Integer memNo;
    private Date rTrackTime;
    private Date expRentalDate;

    public Integer getrNo() {
        return rNo;
    }

    public void setrNo(Integer rNo) {
        this.rNo = rNo;
    }

    public Integer getMemNo() {
        return memNo;
    }

    public void setMemNo(Integer memNo) {
        this.memNo = memNo;
    }

    public Date getrTrackTime() {
        return rTrackTime;
    }

    public void setrTrackTime(Date rTrackTime) {
        this.rTrackTime = rTrackTime;
    }

    public Date getExpRentalDate() {
        return expRentalDate;
    }

    public void setExpRentalDate(Date expRentalDate) {
        this.expRentalDate = expRentalDate;
    }
}
