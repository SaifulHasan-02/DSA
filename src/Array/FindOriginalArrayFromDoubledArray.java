package Array;

//https://leetcode.com/problems/find-original-array-from-doubled-array/

import java.util.*;

public class FindOriginalArrayFromDoubledArray {
    public static void main(String[] args) {
        int[] changed = {3,3,3,3};
        System.out.println(Arrays.toString(findOriginalArray(changed)));//ye glt hai
        System.out.println(Arrays.toString(findOriginalArray2(changed)));
    }
    public static int[] findOriginalArray2(int[] changed) {
        int[] temp = new int[changed.length/2];
        Queue<Integer> x = new LinkedList<>();
        Arrays.sort(changed);
        int i = 0;
        for(int num : changed){
            if(!x.isEmpty() && x.peek()==num)
                temp[i++] = x.poll()/2;
            else x.add(num*2);
        }
        return x.size()>0 ? new int[]{}:temp;
    }
    public static int[] findOriginalArray(int[] changed) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer>set = new HashSet<>();
        for (int e:changed) {
            set.add(e);
        }
        int s = changed.length;
        if(set.size() == 1 && changed[0] == 0){
            int[] ans = new int[s/2];
            int i = 0;
            for (int j = 0; j < s/2; j++) {
                ans[i++] = changed[0];
            }
            return ans;
        }
        for (int i = 0;i<changed.length/2;i++) {
            if(!set.contains(2*changed[i])){
                break;
            }
            else {
                list.add(changed[i]);
                set.remove(2*changed[i]);
            }
        }
        int n = list.size(),i=0;
        int[]ans = new int[n];
        for(Integer e:list){
            ans[i++] = e;
        }
        return ans;
    }
}
