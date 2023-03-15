package Array;

import java.util.Scanner;

public class MaxDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[]arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxDiff(N,arr));
        System.out.println(findMaximumDiff(arr,N));
    }
    public static int maxDiff(int N, int[]arr){
        int start = 0,end = N-1;
        int diff = 0;
        while (start < end){
            if(arr[start] < arr[end]){
                diff = Math.max(diff,end-start);
                end--;
            }
            else{
                start++;
            }

        }
        return diff;
    }
    static int findMaximumDiff(int []a, int n)
    {
        int ind1 = 0;

        // Iteratively check from back
        for (int i = n - 1; i > 0; i--)
        {

            // Different numbers
            if (a[0] != a[i])
            {
                ind1 = i;
                break;
            }
        }

        int ind2 = 0;

        // Iteratively check from
        // the beginning
        for (int i = 0; i < n - 1; i++)
        {

            // Different numbers
            if (a[n - 1] != a[i])
            {
                ind2 = (n - 1 - i);
                break;
            }
        }

        return Math.max(ind1, ind2);
    }

// Driver code
}
