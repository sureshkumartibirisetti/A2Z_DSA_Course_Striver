package Step_2_Learn_Important_Sorting_Techniques.Lec_1_Sorting_1;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1,1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            int a=i;
            while(a>0 && arr[a]<arr[a-1]){
                int temp=arr[a-1];
                arr[a-1]=arr[a];
                arr[a]=temp;
                a--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
