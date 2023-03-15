package Array;

public class PerfectNumber {
    public static void main(String[] args) {
        int n = 10;
        isPerfectNumber(n);
    }
    public static void isPerfectNumber(int n){
        int sum = 0;

        for (int i = 1; i < n; i++) {
            int r = n % i;

            if(r == 0){
                sum = sum + i;
            }
        }
        if(n == sum){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("NOT perfect Number");
        }
    }
}
