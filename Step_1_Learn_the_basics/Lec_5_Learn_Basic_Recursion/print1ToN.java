package Step_1_Learn_the_basics.Lec_5_Learn_Basic_Recursion;

public class print1ToN {
    public static void main(String[] args) {
        int a=10;
        prints(1,a+1);
    }
    public static void prints(int a,int n){
        if(a==n){
            return;
        }
        System.out.println(a);
        prints(a+1,n);
    }
}
