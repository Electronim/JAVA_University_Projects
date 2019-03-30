package tasks.shapeDemo;

public class Main {
    public static void main(String args[]) {
        Rectangle A = new Rectangle(5.0, 3.0);
        System.out.println(A.getArea() + " " + A.getPerimeter());

        Square S = new Square(6.0);
        System.out.println(S.getArea() + " "  + S.getPerimeter());

        Triangle T = new Triangle(3.0, 4.0, 5.0);
        System.out.println(T.getArea() +  " " + T.getPerimeter());

        CustomTriangle CT = new CustomTriangle(3., 4., 5.,
                    "Triunghi dreptunghic", "Acesta este un triunghi dreptunghic");

        System.out.println(CT.getName() + ": " + CT.getDescription() + "cu aria = "
                            + CT.getArea() + " si perimetrul = " + CT.getPerimeter());
    }
}
