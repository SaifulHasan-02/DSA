package RecurssionBasic;

import java.util.ArrayList;
import java.util.List;

public class SubSeqOfArray {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
//        List<List<Integer>> ans = new ArrayList<>();
//        subSeq(arr,0,new ArrayList<>(),ans);
//        System.out.println(ans);
        System.out.println(subSeqRet(arr,0,new ArrayList<>()));
    }
    public static void subSeq(int[]arr,int ind,List<Integer>inner,List<List<Integer>>ans){
        if(ind == arr.length){
            ans.add(new ArrayList<>(inner));
            return;
        }

        subSeq(arr,ind+1,inner,ans);
        inner.add(arr[ind]);
        subSeq(arr,ind+1,inner,ans);
        inner.remove(inner.size()-1);

    }
    public static List<List<Integer>> subSeqRet(int[]arr,int ind,List<Integer>inner){
        if(ind == arr.length){
            List<List<Integer>>outer = new ArrayList<>();
            outer.add(new ArrayList<>(inner));
            return outer;
        }
        List<List<Integer>> ans = new ArrayList<>();
        inner.add(arr[ind]);
        ans.addAll(subSeqRet(arr,ind+1,inner));
        inner.remove(inner.size()-1);
        ans.addAll(subSeqRet(arr,ind+1,inner));


        return ans;


    }
}
