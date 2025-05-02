package Step_2_Learn_Important_Sorting_Techniques.Lec_2_Sorting_II;

import java.util.Arrays;

public class recursiveInsertionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        insertionSort(arr,0);
        System.out.println(Arrays.toString(arr));

    }
    static void insertionSort(int[] arr,int a){
        if(a==arr.length){
            return;
        }
        int i=a;
        while(i>0 && arr[i]<arr[i-1]){
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
            i--;
        }
        insertionSort(arr,a+1);
    }

}
//for(int i=0;i<arr.length;i++){
//int a=i;
//while(a>0 && arr[a]<arr[a-1]){
//int temp=arr[a-1];
//arr[a-1]=arr[a];
//arr[a]=temp;
//a--;
//        }
//        }
