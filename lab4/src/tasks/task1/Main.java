package tasks.task1;

public class Main {
    public static void main(String args[]) {
        String str = "abcdefghijklmnopqrstuvwxyz abcdefghijklmnopqrstuvwxyz abc";

        System.out.println(str.indexOf('c'));
        System.out.println(str.lastIndexOf('c'));
        System.out.println(str.length());

        String[] str1 = str.split(" ");
        for (String it : str1) {
            System.out.println(it);
        }

    }
}
