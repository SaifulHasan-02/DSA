package Matrix;

//https://leetcode.com/problems/russian-doll-envelopes/
//nhi hua hai
import java.util.Arrays;

public class RussianDollEnvelopes {
    public static void main(String[] args) {
        int[][] envelopes = {{1,1},{1,1},{1,1}};
        System.out.println(maxEnvelopes(envelopes));

    }
    public static int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length,count = 0;

        Arrays.sort(envelopes,(a, b)-> a[0] == b[0] ? a[1]-b[1] : b[0]-a[0]);
        System.out.println(Arrays.deepToString(envelopes));
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(max > envelopes[i][1]){
                count++;
            }
            max = Math.max(max,envelopes[i][0]);
        }

        return 1+count;
    }
}
