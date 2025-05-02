package Step_1_Learn_the_basics.Lec_4_Know_Basic_Maths;

public class palindrome {
    public static void main(String[] args) {
        String s="caracw";
        System.out.println(palin(s,0,s.length()-1));
    }
    static boolean palin(String s,int l,int r){
        if(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }else{
                palin(s,l+1,r-1);
            }
        }
        return true;

    }
}
