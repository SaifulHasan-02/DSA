package Array;

//https://leetcode.com/problems/numbers-with-same-consecutive-differences/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersWithSameConsecutiveDifferences {
    public static void main(String[] args) {
        int n = 3;
        int k = 7;
        System.out.println(Arrays.toString(numsSameConsecDiff(n, k)));
    }
    static List<Integer>list = new ArrayList<>();
    public static int[] numsSameConsecDiff(int n, int k) {
        for(int i =1;i<10;i++){
            findNumber(i,n,k);
        }
        int[] ans = new int[list.size()];
        int z = 0;
        for(Integer e : list){
            ans[z++] = e;
        }
        return ans;
    }

    public static void findNumber(int num,int n,int k){
        if(countDigits(num) == n){
            list.add(num);
            return;
        }

        for(int i =0;i<10;i++){
            int last = num % 10;

            if(Math.abs(i-last) == k){
                int number = num*10 + i;

                findNumber(number,n,k);
            }
        }
    }
    public static int countDigits(int n){
        return 1+(int)(Math.log(n)/Math.log(10));

    }
}
