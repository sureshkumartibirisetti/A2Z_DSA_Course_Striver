package Step_1_Learn_the_basics.Lec_4_Know_Basic_Maths;

public class reverseANumber {
    public static void main(String[] args) {
        int a=123456789;
        rev(a,0);
    }
    static void rev(int a,int s){
        if(a<=0){
            System.out.println(s);
            return;
        }
        rev(a/10,(s*10)+(a%10));
    }
}
