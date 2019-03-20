package tasks.model;

import tasks.service.ProductService;
import tasks.service.UserService;

public class Main {
    public static void main(String args[]) {
        Product product = new Product();
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
        System.out.println(singleProd.getOne("Mar").getPrice().getStartFrom());
    }
}
