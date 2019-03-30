package tasks.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        List < Enclosure > shapesList = new ArrayList < Enclosure >();
        shapesList.add(new Circle(2));
        shapesList.add(new Square(4));
        shapesList.add(new Circle(5));
        shapesList.add(new Circle(3));
        shapesList.add(new Square(6));
        shapesList.add(new Square(10));
        shapesList.add(new Circle(8));
        shapesList.add(new Square(7));
        shapesList.add(new Circle(9));

        for (Enclosure obj: shapesList) {
            System.out.println(obj.perimeter() + " " + obj.area());
        }
    }
}
