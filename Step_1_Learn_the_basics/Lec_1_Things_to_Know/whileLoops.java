package Step_1_Learn_the_basics.Lec_1_Things_to_Know;

public class whileLoops {
    public static void main(String[] args) {
        // 1. Simple while loop (print 1 to 5)
        System.out.println("1. Simple while loop:");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }

        // 2. Reverse while loop (print 5 to 1)
        System.out.println("\n\n2. Reverse while loop:");
        int j = 5;
        while (j >= 1) {
            System.out.print(j + " ");
            j--;
        }

        // 3. While loop with even numbers
        System.out.println("\n\n3. Even numbers using while loop:");
        int k = 2;
        while (k <= 10) {
            System.out.print(k + " ");
            k += 2;
        }

        // 4. While loop with array traversal
        System.out.println("\n\n4. Traverse array with while loop:");
        int[] arr = {10, 20, 30, 40};
        int idx = 0;
        while (idx < arr.length) {
            System.out.print(arr[idx] + " ");
            idx++;
        }

        // 5. Do-while loop (print 1 to 5)
        System.out.println("\n\n5. Simple do-while loop:");
        int a = 1;
        do {
            System.out.print(a + " ");
            a++;
        } while (a <= 5);

        // 6. Do-while executes at least once even if condition is false
        System.out.println("\n\n6. Do-while executes once even if condition is false:");
        int b = 10;
        do {
            System.out.println("Executed once even though b > 5");
        } while (b < 5);

        // 7. While loop with break
        System.out.println("\n7. While loop with break:");
        int x = 1;
        while (x <= 10) {
            if (x == 6) break;
            System.out.print(x + " ");
            x++;
        }

        // 8. Do-while loop with continue
        System.out.println("\n\n8. Do-while loop with continue (skip 3):");
        int y = 1;
        do {
            if (y == 3) {
                y++;
                continue;
            }
            System.out.print(y + " ");
            y++;
        } while (y <= 5);
    }
}
