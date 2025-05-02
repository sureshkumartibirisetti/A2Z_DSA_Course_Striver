package Step_1_Learn_the_basics.Lec_5_Learn_Basic_Recursion;

public class printNTo1 {
    public static void main(String[] args) {
        int a=10;
        printRev(a);

    }
    static void printRev(int a){
        if(a==0){
            return ;
        }
        System.out.print(a+" ");
        printRev(a-1);
    }
}
