package tasks.task3;

public class Main {
    public static void main(String args[]) {
        String Str1 = "Ele fac";
        String Str2 = "cafele";

        String str1 = Str1.toLowerCase();
        String str2 = Str2.toLowerCase();

        if (str1.length() < 3 || str2.length() < 3) {
            System.out.println("Error");
        } else {
            boolean u = true;
            for (int i = 0; i < 3; i++) {
                u &= (str1.charAt(i) == str2.charAt(str2.length() - i - 1));
            }

            if (u) {
                String cc = Str1.concat(str2);
                System.out.println(cc);
            }
        }
    }
}
