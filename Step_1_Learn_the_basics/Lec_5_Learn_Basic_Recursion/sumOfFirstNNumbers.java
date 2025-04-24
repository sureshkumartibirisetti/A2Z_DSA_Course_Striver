package Step_1_Learn_the_basics.Lec_5_Learn_Basic_Recursion;

public class sumOfFirstNNumbers {
    public static void main(String[] args) {
        int a=10;
        printSum(1,a+1,0);
    }
    public static void printSum(int a,int n,int sum){
        sum+=a;
        if(a==n){
            System.out.println(sum);
            return;
        }
        printSum(a+1,n,sum);
    }
}
