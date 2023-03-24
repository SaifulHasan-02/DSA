package RecurssionBasic;

import java.util.Arrays;

public class Name {
    public static void main(String[] args) {
        String name = "Saiful";
        //print(name,0);
//        printNumInc(1);
//        printNumDec(1);
//        printNumIncBack(5);
//        System.out.println(sum(5));
        int[]arr = {1,2,3,4,5};
//        reverse(arr,0,arr.length-1);
//        reverse2(arr,0);
//        System.out.println(Arrays.toString(arr));

//        String s = "ss";
//        System.out.println(isPalin(s,0));
        int[]dp = new int[6];
        Arrays.fill(dp,-1);
        System.out.println(fib(5,dp));

    }
    public static int fib(int n,int[]dp){
        if(n == 0 || n == 1)return n;
        if(dp[n] != -1)return dp[n];
        dp[n] = fib(n-1,dp)+fib(n-2,dp);
        return dp[n];
    }
    public static boolean isPalin(String s,int ind){
        if(ind > s.length()/2)return true;

        if(s.charAt(ind) != s.charAt(s.length()-1-ind))
            return false;
        return isPalin(s,ind+1);
    }

    public static void reverse2(int[]arr,int ind){
        if(ind >= arr.length/2)return;

        swap(arr,ind,arr.length-1-ind);
        reverse2(arr,ind+1);
    }
    public static void swap(int[]arr, int ind,int e){
        int t = arr[ind];
        arr[ind] = arr[e];
        arr[e] = t;
    }
    public static void reverse(int[]arr,int ind,int e){
        if(ind > e)return;

        int t = arr[ind];
        arr[ind] = arr[e];
        arr[e] = t;
        reverse(arr,ind+1,e-1);
    }
    public static int sum(int n){
        if(n == 0)return 0;

        return n + sum(n-1);
    }
    public static void printNumIncBack(int i){
        if(i <1)return;

        printNumIncBack(i-1);
        System.out.println(i);
    }
    public static void printNumDec(int i){
        if(i>5)return;

        printNumDec(i+1);
        System.out.println(i);
    }
    public static void printNumInc(int i){
        if(i > 5)return;
        System.out.println(i);

        printNumInc(i+1);
    }
    public static void print(String name, int ind){
        if(ind > 4)
            return;
        System.out.println(name);
        print(name,ind+1);
    }
}
