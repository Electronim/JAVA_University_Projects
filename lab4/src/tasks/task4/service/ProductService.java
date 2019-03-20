package tasks.task4.service;


import tasks.task4.model.Category;
import tasks.task4.model.FoodProduct;
import tasks.task4.model.Price;

import java.util.Date;

public class ProductService {
    private static FoodProduct[] listOfProducts = new FoodProduct[2];

    private static ProductService ourInstance = new ProductService();

    public static ProductService getInstance() {
        return ourInstance;
    }

    private ProductService()
    {
        Category cat1 = new Category("Fructe", "Many", null);
        Category cat2 = new Category("Legume", "Many", null);

        Price pr1 = new Price(10.0, new Date(2018 - 1900, 10, 8), new Date(2018 - 1900, 10, 30));

        listOfProducts[0] = new FoodProduct(cat1, pr1, "Mar", "Gustos");
        listOfProducts[1] = new FoodProduct(cat2, pr1, "Rosie", "Rosu");
    }

    public FoodProduct getOne(String name) {
        FoodProduct ans = new FoodProduct();
        for (int i = 0; i < 2; i++) {
            if (name.equals(listOfProducts[i].getName())) {
                ans = listOfProducts[i];
            }
        }

        return ans;
    }

}
