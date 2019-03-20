package tasks.task4;

public class matrixClass {
    public static void main(String args[]) {
        int[][] matrix = {{5,2,1},{3,9,8},{5,7,3}};

        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
