package Step_1_Learn_the_basics.Lec_5_Learn_Basic_Recursion;

public class fibonacci {
    public static void main(String[] args) {
        int a=10;
        System.out.println(fib(a));
    }
    static int  fib(int a){
        if(a<=1){
            return a;
        }
        return fib(a-1)+fib(a-2);
    }
}

