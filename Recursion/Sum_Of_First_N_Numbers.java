package Recursion;

public class Sum_Of_First_N_Numbers {
    private static int NnumbersSum(int N) {
        if (N == 0) {
            return 0;
        }
        return N + NnumbersSum(N-1); 
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println(NnumbersSum(N));
    }
}
