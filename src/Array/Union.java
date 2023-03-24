package Array;

import java.util.Arrays;
import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,99};
        int[] arr2 = {11,12,13,4,5,6,7,8,9,10,1,2,3};
        System.out.println(Arrays.toString(getUnion(arr1,arr2)));
        System.out.println(Arrays.toString(getUnion2(arr1,arr2)));


    }


    private static int[] getUnion(int[] arr1, int[] arr2) { //T(n) = O(nlog(n)+ mlog(m))

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        int[] mix = new int[set.size()];
        int i = 0;
        for (int e:set) {
           mix[i] = e;
           i++;
        }
        return mix;

    }
    private static int[] getUnion2(int[] nums1,int[] nums2){  //T(n) = O(min(n,m))
        int n = nums1.length;
        int m = nums2.length;
        //int min = Math.min(n,m);
        int min = Math.min(n, m);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < min; i++) {
            set.add(nums1[i]);
            set.add(nums2[i]);
        }
        if(n>m){
            for (int i = m; i <n ; i++) {
                set.add(nums1[i]);
            }
        }
        else if(n<m){
            for (int i = n; i < m; i++) {
                set.add(nums2[i]);
            }
        }
        int [] ans = new int[set.size()];
        int k = 0;
        for (Integer e:set) {
            ans[k] = (int)e;
            k++;
        }
        return ans;

    }
}
