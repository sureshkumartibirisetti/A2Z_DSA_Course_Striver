package Step_1_Learn_the_basics.Lec_2_Build_up_Logical_thinking;
/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */
public class p_6 {
    public static void main(String[] args) {
        int a=5;
        for(int i=a;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
