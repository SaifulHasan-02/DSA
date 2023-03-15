package Array;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[]digits = {9};
        System.out.println(Arrays.toString(plusOne(digits)));

    }
    //galat hai
    public static int[] plusOne(int[] digits) {
        String s = "";
        for(int e : digits){
            s = s+e;
        }
        int n = Integer.parseInt(s);
        n = n + 1;

        int m = n;
        int count = 0;
        while (m != 0){
            ++count;
            m = m/10;
        }

        int[] ans = new int[count];

        for(int i = count-1;i>=0;i--){
            ans[i] = n%10;
            n = n/10;
        }
        return ans;
    }
}
