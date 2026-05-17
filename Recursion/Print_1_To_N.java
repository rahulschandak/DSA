package Recursion;

public class Print_1_To_N {
     private static void printNumbers(int n) {
        helperPrint(1, n);
    }

    private static int helperPrint(int curr, int n) {
        if (curr > n) {
            return curr;
        }
        System.out.println(curr);
        return helperPrint(curr + 1, n);
    }

    public static void main(String[] args) {
        int n = 5;
        printNumbers(n);
    }
}
