package tasks.task1;

public class printArray {
    public static void main(String[] args) {
        Integer table1[][] = { { 1, 2 }, { 3, 4 } };
        Integer table2 [][] = { { 1, 2 }, { 3, 4 }, {56,65,33,7} };

        print(table1);
        print(table2);
    }

    static void print(Integer[][] arr) {
        for (Integer[] row: arr) {
            for (Integer elem: row) {
                System.out.print(elem + " ");
            }

            System.out.println();
        }
    }

}
