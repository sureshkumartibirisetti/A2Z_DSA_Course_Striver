package Step_2_Learn_Important_Sorting_Techniques.Lec_2_Sorting_II;

import java.util.Arrays;

public class recursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr,int n){
        if(n==1){
            return;
        }
        int a=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                a=1;
            }
        }
        if(a==0){
            return;
        }
        bubbleSort(arr,n-1);
    }
}
