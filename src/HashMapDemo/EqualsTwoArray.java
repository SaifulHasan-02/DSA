package HashMapDemo;


import java.util.*;

public class EqualsTwoArray {
    public static void main(String[] args) {
        long[] arr1 = {1,2,5,4,0};
        long[] arr2 = {2,4,5,0,1};
        System.out.println(isEquals(arr1,arr2,arr1.length));
    }
    public static boolean isEquals(long[] A,long[] B,int N){
        TreeMap<Long,Long> tm1 = new TreeMap<Long,Long>();
        TreeMap<Long,Long> tm2 = new TreeMap<Long,Long>();
        for(int i=0;i<N;i++){
            if(tm1.containsKey(A[i])){
                tm1.put(A[i],tm1.get(A[i])+1);
            }
            else{
                tm1.put(A[i],(long)1);
            }
        }
        for(int i =0;i<N;i++){
            if(tm2.containsKey(B[i])){
                tm2.put(B[i],tm2.get(B[i]+1));
            }
            else{
                tm2.put(B[i],(long)1);
            }
        }
        if(tm1.equals(tm2)){
            return true;
        }
        else{
            return false;
        }

    }

}
