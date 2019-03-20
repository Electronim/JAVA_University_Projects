package tasks.task4.model;

public abstract class Product {
    private Category category;
    private Price price;
    private String name;
    private String smallDescription;

    public Product() {

    }

    public Product(Category _category, Price _price, String _name, String _smallDescription) {
        category = _category;
        price = _price;
        name = _name;
        smallDescription = _smallDescription;
    }

    public Category getCategory() {
        return category;
    }

    public Price getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getSmallDescription() {
        return smallDescription;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSmallDescription(String smallDescription) {
        this.smallDescription = smallDescription;
    }

    public abstract int roundPrice();
    public abstract String lowerCaseName();
    public abstract String upperCaseName();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
