package tasks.model;

import java.util.Date;

public class Price {
    private Double price;
    private Date startFrom;
    private Date endFrom;

    public Price (Double _price, Date _startFrom, Date _endFrom) {
        price = _price;
        startFrom = _startFrom;
        endFrom = _endFrom;
    }

    public Double getPrice() {
        return price;
    }

    public Date getStartFrom() {
        return startFrom;
    }

    public Date getEndFrom() {
        return endFrom;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setStartFrom(Date startFrom) {
        this.startFrom = startFrom;
    }

    public void setEndFrom(Date endFrom) {
        this.endFrom = endFrom;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
