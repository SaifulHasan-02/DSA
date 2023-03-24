package Array;

import java.util.Arrays;

//https://leetcode.com/problems/candy/
public class Candy {
    public static void main(String[] args) {
        int[] ratings = {1,3,2,2,1};
        System.out.println(candy(ratings));
        System.out.println(candy2(ratings));
    }
    public static int candy2(int[] ratings){
        int n = ratings.length;
        int[] left = new int[ratings.length];
        Arrays.fill(left,1);

        for (int i =1;i<n;i++){
            if(ratings[i-1] < ratings[i])
                left[i] = left[i-1]+1;
        }
        for (int i = n-2; i >=0 ; i--) {
            if(ratings[i]>ratings[i+1]){
                if(left[i]>left[i+1]) {
                    continue;
                }
                else {
                    left[i] = left[i+1]+1;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans + left[i];
        }
        return ans;

    }
    public static int candy(int[] ratings){
        int n = ratings.length;
        int[] left = new int[ratings.length];
        int[] right = new int[n];
        for (int i = 0; i < n; i++) {
            left[i] = 1;
            right[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            if(ratings[i-1]<ratings[i]){
                left[i] = left[i-1]+1;
            }
        }

        for (int i = n-2; i >= 0; i--) {
            if(ratings[i+1]<ratings[i]){
                right[i] = right[i+1]+1;
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + Math.max(left[i],right[i]);
        }
        return sum;
    }
}
