package Array;

import java.util.Arrays;
import java.util.Stack;

//https://leetcode.com/problems/daily-temperatures/
public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
        System.out.println(Arrays.toString(dailyTemperatures2(temperatures)));
    }
    public static int[] dailyTemperatures2(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];

        Stack<Integer>stk = new Stack<>();
        for (int i = 0; i < n-1; i++) {
            while (!stk.isEmpty() && nums[i] >nums[stk.peek()]){
                int ind = stk.pop();
                ans[ind] = i-ind;

            }
            stk.push(i);
        }
        return ans;
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        int k = 0;
        for(int i = 0; i < n-1; i++){
            if(temperatures[i]<temperatures[i+1]){
                ans[k] = 1;
                k++;
            }else{
                int next = i+1;
                while (next <n && temperatures[i]>=temperatures[next]){
                    next++;
                }
                if(next <= n-1) {
                    ans[k] = next - i;

                }else{
                    ans[k] = 0;

                }
                k++;

            }
        }
        while(k<n) {
            ans[k] = 0;
            k++;
        }
        return ans;
    }
}
