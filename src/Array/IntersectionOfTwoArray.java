package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    public static <ArraysList> int[] intersection(int[] nums1, int[] nums2){
        int n = nums1.length;
        int m = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i =0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int k = 0;
        while (i<n && j<m){
            if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] ans = new int[list.size()];
        for (Integer e:list) {
            ans[k] = (int)e;
            k++;
        }
        return ans;
    }
}
