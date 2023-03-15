package Array;

import java.util.Arrays;

public class EqualSumArraysWithMinimumNumberOfOperations {
    public static void main(String[] args) {
        int[]nums1 = {1,2,3,4,5,6};
        int[]nums2 = {1,1,2,2,2,2};
        System.out.println(minOperations(nums1,nums2));

    }
    public static int minOperations(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int s1 = 0, s2 = 0;
        for (int e : nums1) {
            s1 += e;
        }
        for (int e:nums2){
            s2 += e;
        }

        if(s1 == s2){
            return 0;
        }

        if(s1 > s2){
            return solve(nums1,nums2,s1,s2);
        }
        return solve(nums2,nums1,s2,s1);
    }

    private static int solve(int[] nums1, int[] nums2, int s1, int s2) {
        int i = nums1.length-1;
        int j = 0;
        int ans = 0;

        int l1 = nums1.length * 1;
        int r2 = nums2.length * 6;
        if(l1 > r2){
            return -1;
        }

        while (i >= 0 || j < nums2.length){
            if(s1 <= s2){
                break;
            }

            int change1 = -1;
            int change2 = -1;

            if(i >= 0){
                change1 = Math.abs(nums1[i]-1);

            }
            if(j < nums2.length){
                change2 = Math.abs(6-nums2[j]);
            }

            if(change1 >= change2){
                s1 = s1-nums1[i]+1;
                i--;
            }
            else{
                s2 = s2-nums2[j]+6;
            }
            ans++;
        }
        return ans;
    }
}
