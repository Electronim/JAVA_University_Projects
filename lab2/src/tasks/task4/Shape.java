package tasks.task4;

public class Shape {
    public static int counter = 5;
    public String name;
    public String color;

    public Shape(String _name, String _color) {
        ++counter;
        name = _name;
        color = _color;
    }

    public void printFields() {
        System.out.println(name + " " + color);
    }
}
