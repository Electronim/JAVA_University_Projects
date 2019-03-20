package tasks.task4.model;

import java.util.Date;

public class Invoice {
    private Date invoiceDate;
    private String invoiceName;
    private InvoiceItem[] invoiceItems;

    Invoice(Date invoiceDate, String invoiceName, InvoiceItem[] invoiceItems) {
        this.invoiceDate = invoiceDate;
        this.invoiceName = invoiceName;

        this.invoiceItems = new InvoiceItem[invoiceItems.length];
        System.arraycopy(invoiceItems, 0, this.invoiceItems, 0, invoiceItems.length);
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    public InvoiceItem[] getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(InvoiceItem[] invoiceItems) {
        System.arraycopy(invoiceItems, 0, this.invoiceItems, 0, invoiceItems.length);
    }
}
