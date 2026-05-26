package Recursion;

import java.util.Arrays;

public class Reverse_Recursion {
    private static int[] reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        reverseHelper(arr, left, right);
        return arr;
    }

    private static void reverseHelper(int[] arr, int left, int right) {
        
        if (left >= right) {
            return;
        }

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseHelper(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print(Arrays.toString(reverse(arr)));
    }
}
