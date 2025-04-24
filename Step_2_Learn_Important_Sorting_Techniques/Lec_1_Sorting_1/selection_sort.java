package Step_2_Learn_Important_Sorting_Techniques.Lec_1_Sorting_1;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr=	{2, 3, 2, 1, 3};
        for(int i=0;i<arr.length-1;i++){
            int b=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[b]>arr[j]){
                    b=j;
                }
            }
            if(b!=0){
                int temp=arr[b];
                arr[b]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
