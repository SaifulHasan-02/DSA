package Array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MinimumNoOfStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entert value of n");
        int n = sc.nextInt();

        minimumNoOfSetep(n);
    }
    public static void minimumNoOfSetep(int n){
        int count = 0;
        while(n > 1){
            if(n % 2 == 0){

                n /= 2;
            }
            else{

                n -= 1;
            }
            count++;
        }
        System.out.println(count);
    }
}
