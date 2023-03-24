package Array;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 152;
        System.out.println(isArmstrong(n));
    }
    public static boolean isArmstrong(int n){
        int org = n;
        int sum = 0;
        while (n != 0){
            int r = n % 10;
            sum = sum + (r * r * r);
            n /= 10;
        }
        return sum == org;
    }
}
