package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class DifferenceArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        System.out.println(getDiff(nums1,nums2));
    }

    public static List<List<Integer>> getDiff(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<List<Integer>> majorList = new ArrayList<List<Integer>>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int k = 0;
        while(k<nums1.length){
            for (int i = 0; i < nums2.length; i++) {
                if(nums1[k] == nums2[i]){
                    k++;
                    i=0;
                }
            }
            list1.add(nums1[k]);
            k++;
        }
        int ind = 0;
        while(ind<nums2.length){
            for (int i = 0; i < nums1.length; i++) {
                if(nums2[ind] == nums1[i]){
                    ind++;
                    i=0;
                }
            }
            list2.add(nums2[ind]);
            ind++;
        }
        majorList.add(list1);
        majorList.add(list2);
        return  majorList;
    }
}
