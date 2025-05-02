package Step_2_Learn_Important_Sorting_Techniques.Lec_2_Sorting_II;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr={4,6,2,5,7,9,1,3};
        int p=arr[0];
        int l=0;
        int r=arr.length-1;
        while(l<r){
            if(arr[l]>p &&  arr[r]<p){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
            if(arr[l]<=p){
                l++;
            }
            if(arr[r]>=p){
                r--;
            }
        }
        int temp=arr[r-1];
        arr[r-1]=p;
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));


    }
}
