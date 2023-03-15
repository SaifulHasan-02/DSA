package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class StartWithZero {
    public static void main(String[] args) {
        int[] arr = {12,0,7,0,8,0,3};
        System.out.println(Arrays.toString(getStartWithZero(arr)));
        System.out.println(Arrays.toString(getStartWithZero2(arr)));
        System.out.println(Arrays.toString(getStartWithZero3(arr)));
        System.out.println(Arrays.toString(getStartWithZero4(arr)));//BEST

    }
    public static int[] getStartWithZero4(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int ind = n-1;
        for (int i = n-1; i >=0 ; i--) {
            if(arr[i] != 0){
                ans[ind--] = arr[i];
            }
        }
        return ans;
    }
    public static int[] getStartWithZero3(int[] arr){
        int n = arr.length;
        int[]ans = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                count++;
            }
        }
        int i = count;
        for (int j = 0; j < n; j++) {
            if(arr[j] != 0){
                ans[i++] = arr[j];
            }
        }
        return ans;
    }
    public static int[] getStartWithZero2(int[] arr){
        int n  = arr.length;
        List<Integer> list = new ArrayList<>();
        for(int i =n-1;i>=0;i--){
            if(arr[i] != 0){
                list.add(0,arr[i]);
            }
        }

        int[] ans = new int[n];
        int i = n-list.size();
        for (int j = 0; j < list.size() ; j++) {
            ans[i++] = list.get(j);
        }
        return ans;
    }
    public static int[] getStartWithZero(int[] arr){
        int n = arr.length;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                list1.add(arr[i]);
            }else{
                list2.add(arr[i]);
            }
        }
        int i = 0;
        for (int e: list1) {
            arr[i] = e;
            i++;
        }
        for (int e:list2) {
            arr[i] = e;
            i++;
        }

        return arr;
    }
}
