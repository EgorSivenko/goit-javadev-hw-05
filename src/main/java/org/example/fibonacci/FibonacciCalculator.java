package org.example.fibonacci;

public class FibonacciCalculator {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static long fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int first = 0, second = 1, next = 0;

        for (int i = 2; i <= n; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        return next;
    }

    // Time Complexity: O(2 ^ n)
    // Space Complexity: O(2 ^ n)
    public static long fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static long fibonacciDynamic(int n) {
        int[] arr = new int[n + 2];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(fibonacciIterative(10));
        System.out.println(fibonacciRecursive(10));
        System.out.println(fibonacciDynamic(10));
    }
}
