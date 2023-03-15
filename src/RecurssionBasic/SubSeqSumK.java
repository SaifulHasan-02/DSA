package RecurssionBasic;

import java.util.ArrayList;
import java.util.List;

public class SubSeqSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int k = 2;
        getSubSeqSumK(0,arr,k,new ArrayList<>());
    }
    public static void getSubSeqSumK(int ind,int[] arr, int target,List<Integer>inner){
        if(ind == arr.length){
            if(target == 0) {
                System.out.println(new ArrayList<>(inner));
            }
            return;
        }
        else if(target < 0 ){
            return ;
        }

        getSubSeqSumK(ind+1,arr,target,inner);
        inner.add(arr[ind]);
        getSubSeqSumK(ind+1,arr,target-arr[ind],inner);
        inner.remove(inner.size()-1);

    }
}
