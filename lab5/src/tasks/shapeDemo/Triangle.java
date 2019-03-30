package tasks.shapeDemo;

public class Triangle implements Shape{
    private Double sideA;
    private Double sideB;
    private Double sideC;

    public Triangle(Double sideA, Double sideB, Double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getArea() {
        double semiP = getPerimeter() / 2;
        return Math.sqrt(semiP * (semiP - sideA) * (semiP - sideB) * (semiP - sideC));
    }
}
