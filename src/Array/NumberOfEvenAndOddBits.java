package Array;

//https://leetcode.com/contest/weekly-contest-337/problems/number-of-even-and-odd-bits/
import java.util.Arrays;

public class NumberOfEvenAndOddBits {
    public static void main(String[] args) {
        int n = 17;
        System.out.println(Arrays.toString(evenOddBit(n)));
    }

    public static int[] evenOddBit(int n) {
        int[] ans = new int[2];
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
        sb.reverse();
        System.out.println(sb);
        int cntEven = 0, cntOdd = 0;

        for (int i = 0; i < sb.length(); i++) {
            if ((i % 2 == 0) && sb.charAt(i) == '1') {
                cntEven++;
            } else if ((i % 2 != 0) && sb.charAt(i) == '1') {
                cntOdd++;
            }
        }
        ans[0] = cntEven;
        ans[1] = cntOdd;
        return ans;
    }
}
