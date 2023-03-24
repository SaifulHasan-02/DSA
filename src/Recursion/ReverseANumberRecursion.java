package Recursion;

public class ReverseANumberRecursion {
    public static void main(String[] args) {
        int n = 125;
       // reverse(n);
        int m =5;
        print(m);
        //System.out.println(sum);
    }
    public static void print(int m){
        if(m == 0){
            return;
        }
        print(m-1);
        System.out.println(m);
    }
    static int sum = 0;
    public static void reverse(int n){
        if(n == 0){
            return;
        }
        int r = n%10;
        sum = 10*sum+r;
        reverse(n/10);
    }
}
