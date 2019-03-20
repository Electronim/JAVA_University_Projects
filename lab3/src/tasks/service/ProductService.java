package tasks.service;

import tasks.model.Category;
import tasks.model.Price;
import tasks.model.Product;

import java.util.Date;

public class ProductService {
    private static Product[] listOfProducts = new Product[2];

    private static ProductService ourInstance = new ProductService();

    public static ProductService getInstance() {
        return ourInstance;
    }

    private ProductService()
    {
        Category cat1 = new Category("Fructe", "Many", null);
        Category cat2 = new Category("Legume", "Many", null);

        Price pr1 = new Price(10.0, new Date(2018 - 1900, 10, 8), new Date(2018 - 1900, 10, 30));

        listOfProducts[0] = new Product(cat1, pr1, "Mar", "Gustos");
        listOfProducts[1] = new Product(cat2, pr1, "Rosie", "Rosu");
    }

    public Product getOne(String name) {
        Product ans = new Product();
        for (int i = 0; i < 2; i++) {
            if (name.equals(listOfProducts[i].getName())) {
                ans = listOfProducts[i];
            }
        }

        return ans;
    }

}
