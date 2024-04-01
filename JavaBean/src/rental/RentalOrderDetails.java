package rental;

import java.sql.Date;

public class RentalOrderDetails {

    private Integer rOrdNo;
    private Integer rNo;
    private Double rPrice;
    private Double rDesPrice;

    public Integer getrOrdNo() {
        return rOrdNo;
    }

    public void setrOrdNo(Integer rOrdNo) {
        this.rOrdNo = rOrdNo;
    }

    public Integer getrNo() {
        return rNo;
    }

    public void setrNo(Integer rNo) {
        this.rNo = rNo;
    }

    public Double getrPrice() {
        return rPrice;
    }

    public void setrPrice(Double rPrice) {
        this.rPrice = rPrice;
    }

    public Double getrDesPrice() {
        return rDesPrice;
    }

    public void setrDesPrice(Double rDesPrice) {
        this.rDesPrice = rDesPrice;
    }
}
