package tasks.task4;

public class Main {
    public static void main(String[] args) {
        Shape obj1 = new Shape("Sandu", "red");
        Shape obj2 = new Shape("Sandu", "black");
        Shape obj3 = new Shape("Sandu", "yellow");

        System.out.println("counter = " + Shape.counter);

        Shape[] arr = {obj1, obj2, obj3};

        for (Shape elem: arr) {
            elem.printFields();
        }
    }
}
