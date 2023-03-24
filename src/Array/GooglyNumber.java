package Array;

import java.util.Scanner;

public class GooglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        isGoogly(N);
    }
    public static void isGoogly(int N){
        int sum = 0;
        while (N != 0){
            int r = N % 10;
            sum += r;
            N /= 10;
        }
        if(isPrime(sum)){
            System.out.println("Googly");
        }
        else{
            System.out.println("Not Googly");
        }
    }
    public static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
