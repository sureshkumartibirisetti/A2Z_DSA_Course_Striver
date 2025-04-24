package Step_1_Learn_the_basics.Lec_1_Things_to_Know;

import java.util.Arrays;
import java.util.Scanner;

public class What_are_arrays_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String input and operations
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("First character: " + str.charAt(0));
        System.out.println("Substring (0 to 3): " + str.substring(0, 3));
        System.out.println("Contains 'java': " + str.contains("java"));
        System.out.println("Replace 'a' with '@': " + str.replace('a', '@'));
        System.out.println("Split by space:");
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        // Array input and operations
        System.out.print("\nEnter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        Arrays.sort(arr);
        System.out.println("\nSorted array:");
        System.out.println(Arrays.toString(arr));

        int max = arr[arr.length - 1];
        int min = arr[0];
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int index = Arrays.binarySearch(arr, key);
        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
