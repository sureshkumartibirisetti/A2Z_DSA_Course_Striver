package Step_1_Learn_the_basics.Lec_1_Things_to_Know;

public class forLoops {
    public static void main(String[] args) {
        // 1. Simple for loop (print 1 to 5)
        System.out.println("1. Print numbers 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        // 2. Reverse for loop
        System.out.println("\n\n2. Print numbers 5 to 1:");
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }

        // 3. For loop with step of 2
        System.out.println("\n\n3. Print even numbers from 2 to 10:");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }

        // 4. Nested for loop (multiplication table of 2 to 4)
        System.out.println("\n\n4. Multiplication table from 2 to 4:");
        for (int i = 2; i <= 4; i++) {
            System.out.println("Table of " + i + ":");
            for (int j = 1; j <= 5; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }

        // 5. For-each loop (array traversal)
        System.out.println("5. For-each loop for array:");
        int[] nums = {10, 20, 30, 40, 50};
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // 6. Loop through characters of a string
        System.out.println("\n\n6. Characters in string 'Java':");
        String str = "Java";
        for (int i = 0; i < str.length(); i++) {
            System.out.println("Char at " + i + ": " + str.charAt(i));
        }

        // 7. Loop with break
        System.out.println("\n7. Loop with break:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) break;
            System.out.print(i + " ");
        }

        // 8. Loop with continue
        System.out.println("\n\n8. Loop with continue (skip 5):");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) continue;
            System.out.print(i + " ");
        }
    }
}
