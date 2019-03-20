package tasks.model;

public class FoodProduct extends Product {
    @Override
    public String getName() {
        return "This is " + super.getName();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
