package tasks.shapeDemo;

public class Rectangle implements Shape {
    private Double sideA;
    private Double sideB;

    public Rectangle(Double sideA, Double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getArea() {
        return sideA * sideB;
    }

    public double getPerimeter() {
        return 2 * (sideA + sideB);
    }
}
