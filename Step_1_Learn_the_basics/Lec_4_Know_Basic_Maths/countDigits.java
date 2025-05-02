package Step_1_Learn_the_basics.Lec_4_Know_Basic_Maths;

public class countDigits {
    public static void main(String[] args) {
        int a=123450;
        countDig(a,0);
    }
    static void countDig(int a,int s){
        if(a<=0){
            System.out.println(s);
            return;
        }
        countDig(a/10,s+1);
    }

}
