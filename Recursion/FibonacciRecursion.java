// There are better ways to calculate Fibonacci numbers, but this is the most basic way to do it using recursion. 
// The time complexity of this approach is O(2^n) because it does a lot of redundant calculations. 
// For example, fib(5) will calculate fib(4), fib(3), fib(2), fib(1), and fib(0) multiple times.
// Better way is dynamic programming or memoization, which can reduce the time complexity to O(n) by storing previously calculated results.

package Recursion;

public class FibonacciRecursion {

    private static int fib(int n) {
        if (n == 1 || n == 0) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.print(fib(n));
    }
}