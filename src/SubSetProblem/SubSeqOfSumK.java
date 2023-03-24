package SubSetProblem;

import java.util.ArrayList;

public class SubSeqOfSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int k = 4;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(isSubSeqOfSumK(arr,0,list,0,k,arr.length));
    }
    public static boolean isSubSeqOfSumK(int[] arr,int ind,ArrayList<Integer>list,int s,int target,int n){
        if(ind == n){
            if(s == target){

                return true;
            }

            return false;
        }
        if(isSubSeqOfSumK(arr,ind+1,list,s,target,n)){
            return true;
        }

        list.add(arr[ind]);
        s = s+arr[ind];

        // list.remove(arr[ind]);
        //s= s-arr[ind];

        if(isSubSeqOfSumK(arr,ind+1,list,s,target,n)){
            return true;
        }
        return false;
    }
}
