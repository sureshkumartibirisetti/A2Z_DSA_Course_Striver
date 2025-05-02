package Step_1_Learn_the_basics.Lec_6_Learn_Basic_Hashing;

import java.util.HashMap;

public class freqOfEleInArr {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,5,5,3,7,1,8,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        freq(arr,0,arr.length,map);
        System.out.println(map);
    }
    static void freq(int[] arr,int l,int r,HashMap<Integer,Integer> map){
        if(l==r){
            return;
        }
        map.put(arr[l],map.getOrDefault(arr[l],0)+1);
        freq(arr,l+1,r,map);
    }
}
