package Array;

public class PrintOneToHundred {
    public static void main(String[] args) {
        int n = 100;
//        print(n);
//        fib(10);
        String[] str = {"cate","natee","safty","saiful","Tipu"};
//        thirdLetter(str);
        primeRange(20);
    }
    public static void primeRange(int n){
        for (int i = 2; i <= n ; i++) {
            if(isPrime(i)){
                System.out.print(i +" ");
            }
        }

    }
    public static boolean isPrime(int n){
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void thirdLetter(String[] str){
        for (String s: str) {
            System.out.print(s.charAt(2)+" ");
        }
    }
    public static void print(int n){
        System.out.print(1+" ");
        for (int i = 1; 5 *i <= 100   ; i++) {

                System.out.print(5 * i + " ");
        }
    }
    public static void fib(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(isFib2(i)+" ");
        }
    }
    public static int isFib2(int n){
        if(n <= 1)
            return n;
        int[]dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static int isFib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return isFib(n-1)+isFib(n-2);
    }

}
