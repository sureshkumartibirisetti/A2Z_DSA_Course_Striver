package Step_1_Learn_the_basics.Lec_5_Learn_Basic_Recursion;

import java.util.Scanner;

public class printNTimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNames(n);
    }
    public static void printNames(int n){
        if(n==0){
            return;
        }
        System.out.println("suresh");
        printNames(n-1);
    }
}
