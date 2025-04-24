package Step_1_Learn_the_basics.Lec_1_Things_to_Know;

import java.util.Arrays;

public class Time_Complexity {
    public static void main(String[] args) {
        int[] arr = {50, 20, 40, 10, 30};
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr); // For binary search

        System.out.println("=== Time Complexity Examples ===\n");

        constantTime(arr);                        // O(1)
        linearTime(arr);                          // O(n)
        quadraticTime(arr);                       // O(n^2)
        logarithmicTime(sortedArr, 30);           // O(log n)
        linearithmicTime(arr.clone());            // O(n log n)

        int n = 5;
        System.out.println("O(2^n) - Exponential Time (Fibonacci of " + n + "): " + exponentialTime(n));

    }
    // O(1) - Constant Time
    static void constantTime(int[] arr) {
        System.out.println("O(1) - Constant Time: " + arr[0]);
    }

    // O(n) - Linear Time
    static void linearTime(int[] arr) {
        System.out.print("O(n) - Linear Time: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // O(n^2) - Quadratic Time
    static void quadraticTime(int[] arr) {
        System.out.println("O(n^2) - Quadratic Time:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }

    // O(log n) - Logarithmic Time
    static void logarithmicTime(int[] arr, int key) {
        int index = Arrays.binarySearch(arr, key);
        System.out.println("O(log n) - Binary Search: Index of " + key + " is " + index);
    }

    // O(n log n) - Merge Sort (Using Arrays.sort internally)
    static void linearithmicTime(int[] arr) {
        Arrays.sort(arr); // O(n log n)
        System.out.println("O(n log n) - After Sorting: " + Arrays.toString(arr));
    }

    // O(2^n) - Exponential Time
    static int exponentialTime(int n) {
        if (n <= 1) return n;
        return exponentialTime(n - 1) + exponentialTime(n - 2);
    }
}
