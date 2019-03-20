package tasks.task4.model;

public class InvoiceItem {
    private Product produs;
    private double TVA;

    InvoiceItem(Product produs, double TVA) {
        this.produs = produs;
        this.TVA = TVA;
    }

    public Product getProdus() {
        return produs;
    }

    public void setProdus(Product produs) {
        this.produs = produs;
    }

    public double getTVA() {
        return TVA;
    }

    public void setTVA(double TVA) {
        this.TVA = TVA;
    }
}
