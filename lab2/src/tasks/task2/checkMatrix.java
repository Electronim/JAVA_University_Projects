package tasks.task2;

public class checkMatrix {
    public static void main(String[] args) {
        Integer mat[][] = {{1, 2, 3}, {2, 1, 4}, {3, 4, 3}};
        Integer arr[][] = {{3, 5, 8}, {3, 4, 7}, {8, 5, 3}};

        System.out.println(isSymmetric(mat));
        System.out.println(isSymmetric(arr));
    }

    static Boolean isSymmetric(Integer[][] mat) {
        Boolean u = true;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                u &= (mat[i][j] == mat[j][i]);
            }
        }

        return u;
    }
}
