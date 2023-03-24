package SubSetProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SubSetOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        //System.out.println(subSet(arr));
        //System.out.println(subSet2(arr));
        //System.out.println(subSet3(arr));
        //ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        //subset(subsets,arr,new ArrayList<>(),0);
        //System.out.println(subsets);
//        List<List<Integer>> list = new LinkedList<>();
//        List<Integer> ans = new LinkedList<>();
//        subSetRe(arr,0,list,ans,arr.length);
        subSetLast(arr,0,new ArrayList<>());
    }
    public static void subSetLast(int[]arr,int ind,ArrayList<Integer>ans){
        if(ind == arr.length){
            if(ans.size()>=3)
                System.out.println(ans);
            return;
        }
        subSetLast(arr,ind+1,new ArrayList<>(ans));
        ans.add(arr[ind]);
        subSetLast(arr,ind+1,new ArrayList<>(ans));

    }

    public static void subSetRe(int[]arr,int ind,List<List<Integer>> list,List<Integer>ans,int n){
        if(ind == n){
            //list.add(ans);
            System.out.println(ans);
            return;
        }

        subSetRe(arr,ind+1,list,ans,n);
        ans.add(arr[ind]);
        subSetRe(arr,ind+1,list,ans,n);

    }
    //for removal of duplicate by Kunal but not all test cases pass
    public static List<List<Integer>> subSet2(int[] arr){
        List<List<Integer>>outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0,end = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i>0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }


        return outer;
    }
    public static List<List<Integer>> subSet3(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int e:arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer>inner = new ArrayList<>(outer.get(i));
                Collections.sort(inner);
                inner.add(e);
                if(!outer.contains(inner))
                    outer.add(inner);
            }
        }
        return outer;
    }
    public static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int e:arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer>inner = new ArrayList<>(outer.get(i));
                inner.add(e);
                outer.add(inner);
            }
        }
        return outer;
    }
    private static void subset(ArrayList<ArrayList<Integer>> subsets,int[] arr,ArrayList<Integer> ans, int index) {
        if(index == arr.length){
            subsets.add(ans);
            return;
        }

        subset(subsets,arr,new ArrayList<>(ans),index+1);
        ans.add(arr[index]);
        subset(subsets,arr,new ArrayList<>(ans),index+1);
    }

}
