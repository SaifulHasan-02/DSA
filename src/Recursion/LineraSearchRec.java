package Recursion;

import java.util.ArrayList;

public class LineraSearchRec {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,6,7,10,10,10};
        int target = 10;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(search2(arr,target,0,list));
        System.out.println(search(arr,target,0));
        System.out.println(searchBest(arr,target,0));
    }
    public static ArrayList<Integer> searchBest(int[] arr,int target,int ind){
        ArrayList<Integer> list = new ArrayList<>();
        if(ind == arr.length){
            return list;
        }
        else if(arr[ind] == target){
            list.add(ind);
        }
        ArrayList<Integer> ansFromBelowCalls = searchBest(arr,target,ind+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

    public static int search(int[] arr,int target,int ind){
        if(ind == arr.length){
            return 0;
        }
        else if(arr[ind]==target){
            return ind;
        }
        return search(arr,target,ind+1);
    }
    public static ArrayList<Integer> search2(int[] arr,int target,int ind,ArrayList<Integer>list){
        if(ind == arr.length){
            return list;
        }
        else if(arr[ind]==target){
            list.add(ind);
        }
        return search2(arr,target,ind+1,list);

    }
}
