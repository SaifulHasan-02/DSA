package Recursion;

public class PrintRangeOfNumber {
    public static void main(String[] args) {
        int n = 5;
        //print(n);
        print2(n);
    }

    private static void print2(int n) {
        if(n == 0){
            return;
        }
        print2(n-1);
        System.out.println(n);
    }

    public static void print(int n){
        if( n== 0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}