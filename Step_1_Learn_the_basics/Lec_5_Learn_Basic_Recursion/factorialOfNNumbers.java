package Step_1_Learn_the_basics.Lec_5_Learn_Basic_Recursion;

public class factorialOfNNumbers {
    public static void main(String[] args) {
        int a=10;
        fact(a,1);
    }
    static void fact(int a,int f){
        if(a==1){
            System.out.println(f);
            return;
        }
        fact(a-1,f*a);
    }
}
