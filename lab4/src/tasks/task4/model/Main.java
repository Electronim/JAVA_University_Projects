package tasks.task4.model;

import tasks.task4.service.ProductService;
import tasks.task4.service.UserService;

import java.util.Date;

public class Main {
    public static void main(String args[]) {
        FoodProduct product = new FoodProduct();
        product.setName("Product 1");

        FoodProduct foodProduct = new FoodProduct();
        foodProduct.setName("Product 2");

        System.out.println(product.getName());
        System.out.println(foodProduct.getName());

        Product foodProduct2 = new FoodProduct();
        foodProduct2.setName("Product 3");

        System.out.println(foodProduct2.getName());

        UserService single = UserService.getInstance();
        System.out.println(single.getOne("Marcu").getId());

        ProductService singleProd = ProductService.getInstance();
        System.out.println(singleProd.getOne("Mar").getName());

        InvoiceItem item1 = new InvoiceItem(product, 23.4);
        InvoiceItem item2 = new InvoiceItem(foodProduct, 10.0);
        InvoiceItem item3 = new InvoiceItem(foodProduct2, 2.3);

        InvoiceItem[] vecItems = {item1, item2, item3};
        Invoice invoice = new Invoice(new Date(2019 - 1900, 2, 19), "Invoice 1", vecItems);

        System.out.println(invoice.getInvoiceName());
        for (InvoiceItem it : invoice.getInvoiceItems()) {
            System.out.println(it.getProdus().getName());
        }
    }
}
