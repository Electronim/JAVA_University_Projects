package tasks.task4.model;

public class FoodProduct extends Product {
    public FoodProduct() {
        super();
    }

    public FoodProduct(Category _category, Price _price, String _name, String _smallDescription) {
        super(_category, _price, _name, _smallDescription);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int roundPrice() {
        return this.getPrice().getPrice().intValue();
    }

    public String lowerCaseName() {
        return this.getName().toLowerCase();
    }

    public String upperCaseName() {
        return this.getName().toUpperCase();
    }
}
