package SubSetProblem;
import java.util.*;
//https://leetcode.com/problems/longest-consecutive-sequence/
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        //System.out.println(longestConsecutive(nums));
        System.out.println(longestConsecutive2(nums));
        System.out.println(longestConsecutive3(nums));
    }
    public static int longestConsecutive3(int[] nums){
        HashSet<Integer>set = new HashSet<>();
        for (int e:nums) {
            set.add(e);
        }
        int maxLen = 0;
        for(int i =0;i<nums.length;i++){
            if(set.contains(nums[i]-1)){
                continue;
            }else{
                int l = 1;
                int val = nums[i];
                while (set.contains(val+l)){
                    l++;
                }
                maxLen = Math.max(maxLen,l);
            }
        }
        return maxLen;
    }
    public static int longestConsecutive2(int[] nums){  //T(n) = O(n)
        //q li while loop jo hai wo total n time chalega mtlb for loop ager 1 bar chalega to while n1 times chalega
        //wo b n1<<n,,aaise krte krte n1,n2,n3.....Total n1+n2+n3+n4 ...=n ke hi hoga
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int e:nums) {
            map.put(e,true);
        }

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]-1)){
                map.put(nums[i],false);
            }
        }
        System.out.println(map);
        int maxLen = 0;
        for (int ele:nums) {
            if(map.get(ele)){
                int l = 1;
                int val = ele;
                while (map.containsKey(val+l)){
                    l++;
                }
                if(maxLen<l){
                    maxLen = l;
                }

            }
        }

        return maxLen;
    }

    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int count = 0;
        int maxLen = 0;
        int i = 1;
        int c = 0;
        boolean flag = false;
        for (; i < nums.length; i++) {
            if(nums[i]== nums[i-1]) {
                count++;
                continue;
            }
            else if(nums[i]-nums[i-1] != 1){
                flag = true;
                int len = c+1;
                if(len>maxLen){
                    maxLen = len;
                    c = 0;
                }

            }
            else if(nums[i]-nums[i-1] == 1){
                c++;
            }
        }
        if(flag)  return maxLen;

        return nums.length-count;


    }
}

