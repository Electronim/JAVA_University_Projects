package tasks.task5;

import java.util.Scanner;

public class calculatorClass {
    public static void main( String args[] ) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char op = sc.next().charAt(0);

            if (op != '/' && op != '*' && op != '-' && op != '+') {
                break;
            }

            int nr1 = sc.nextInt();
            int nr2 = sc.nextInt();

            if (op == '/' && nr2 == 0) {
                System.out.println("Division by 0!");
                break;
            }

            switch(op) {
                case '/':
                    System.out.println((1.0 * nr1 / nr2));
                    break;
                case '*':
                    System.out.println(nr1 * nr2);
                    break;
                case '+':
                    System.out.println(nr1 + nr2);
                    break;
                default:
                    System.out.println(nr1 - nr2);
                    break;
            }
        }
    }
}
