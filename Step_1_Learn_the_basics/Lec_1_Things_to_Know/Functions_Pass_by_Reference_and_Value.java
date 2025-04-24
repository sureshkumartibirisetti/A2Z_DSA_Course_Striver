package Step_1_Learn_the_basics.Lec_1_Things_to_Know;

public class Functions_Pass_by_Reference_and_Value {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Before modifyPrimitive: x = " + x);
        modifyPrimitive(x);
        System.out.println("After modifyPrimitive: x = " + x);

        // Pass by Reference-like
        int[] nums = {5, 20, 30};
        System.out.println("\nBefore modifyArray: nums[0] = " + nums[0]);
        modifyArray(nums);
        System.out.println("After modifyArray: nums[0] = " + nums[0]);

        // Function that returns a value
        int result = square(4);
        System.out.println("\nSquare of 4 is: " + result);

    }
    static void modifyPrimitive(int a) {
        a = a + 10;
        System.out.println("Inside modifyPrimitive: a = " + a);
    }

    // Pass by Reference-like (Object)
    static void modifyArray(int[] arr) {
        arr[0] = arr[0] + 10;
        System.out.println("Inside modifyArray: arr[0] = " + arr[0]);
    }

    // Function returning a value
    static int square(int num) {
        return num * num;
    }

}
