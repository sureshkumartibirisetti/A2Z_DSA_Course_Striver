package Step_1_Learn_the_basics.Lec_1_Things_to_Know;

public class ifElse {
    public static void main(String[] args) {
        //If statement
        int a = 10, b = 20;

        // if statement
        if (a < b) {
            System.out.println("a is less than b");
        }

        // if-else statement
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is not greater than b");
        }

        // else-if ladder
        if (a == b) {
            System.out.println("a is equal to b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is greater than b");
        }

        // nested if
        if (a < b) {
            if (a < 15) {
                System.out.println("a is less than b and less than 15");
            }
        }

        // ternary operator
        String result = (a < b) ? "a is less than b" : "a is not less than b";
        System.out.println(result);
    }
}
