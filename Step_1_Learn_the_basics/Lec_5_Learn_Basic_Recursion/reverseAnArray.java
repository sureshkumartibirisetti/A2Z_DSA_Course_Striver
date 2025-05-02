package Step_1_Learn_the_basics.Lec_5_Learn_Basic_Recursion;

import java.util.Arrays;

public class reverseAnArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        rev(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int[] arr,int l,int r){
        if(l>r){
            return;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        rev(arr,l+1,r-1);
    }
}
