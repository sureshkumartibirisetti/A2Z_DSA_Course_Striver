package Step_1_Learn_the_basics.Lec_5_Learn_Basic_Recursion;

public class printNtimesBasic {
    public static void main(String[] args) {
        int a=5;
        printNtimes(1,a);
    }
    public static void printNtimes(int a,int n){
        if(a==n){
            return ;
        }
        System.out.println(a);
        printNtimes(a+1,n);
    }
}
