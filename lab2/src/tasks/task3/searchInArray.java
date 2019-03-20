package tasks.task3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class searchInArray {
    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 9, 12, 22, 7, 20};
        int item = 9;

        int[] ans = searchAndCopy(arr, item);
        for (int elem: ans) {
            System.out.print(elem + " ");
        }
    }

    static int[] searchAndCopy(int[] arr, int item) {
        int[] ans = {};
        int pos = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) pos = i;
        }

        if (pos == -1) return ans;

        ans = Arrays.copyOfRange(arr, pos, arr.length);
        return ans;
    }
}
