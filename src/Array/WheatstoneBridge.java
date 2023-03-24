package Array;

import java.util.Scanner;

public class WheatstoneBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R1 = sc.nextInt();
        int R2 = sc.nextInt();
        int R3 = sc.nextInt();
        System.out.println(valueOfR4(R1,R2,R3));
    }
    public static int valueOfR4(int R1,int R2,int R3){
        int ans = (R2/R1)*R3;
        return ans;
    }

}
