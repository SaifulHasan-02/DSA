package Array;

import java.util.Scanner;

public class SumOfRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = sc.nextInt();

        sumOfRemainder(n,div);
    }
    public static void sumOfRemainder(int n,int div){
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            int r = i%div;
            sum += r;
        }
        System.out.println(sum);
    }
}
