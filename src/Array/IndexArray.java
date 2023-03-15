package Array;

import java.util.Arrays;

public class IndexArray {
    public static void main(String[] args) {
        int[] arr = {3,2,0,1};
        System.out.println(Arrays.toString(getIndArray(arr)));
    }
    public static int[] getIndArray(int[] arr){
        int   n = arr.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[arr[i]] = i;
        }
        int i = 0;
        for (int e : ans)arr[i++] = e;
        return arr;
    }

}
