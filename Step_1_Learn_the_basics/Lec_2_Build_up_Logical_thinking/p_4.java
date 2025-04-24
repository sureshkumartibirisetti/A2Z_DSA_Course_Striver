package Step_1_Learn_the_basics.Lec_2_Build_up_Logical_thinking;
/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
 */
public class p_4 {
    public static void main(String[] args) {
        int a=5;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
