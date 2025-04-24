package Step_2_Learn_Important_Sorting_Techniques.Lec_1_Sorting_1;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1,1,1,2,3,4,5};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
