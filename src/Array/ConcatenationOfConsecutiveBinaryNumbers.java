package Array;

//https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers/
public class ConcatenationOfConsecutiveBinaryNumbers {
    public static void main(String[] args) {
//        System.out.println(concatenatedBinary(12));//not working
        System.out.println(concatenatedBinary2(12));
    }
    private static int concatenatedBinary2(int n){
        int mod = (int)Math.pow(10,9)+7;
        long ans = 0;
        for (int i = 1; i <= n ; i++) {
            int p = 1+(int)(Math.log(i)/Math.log(2));

            ans = ans << p;

            ans = (ans + i)%mod;
        }
        return (int)(ans%mod);
    }
    public static int concatenatedBinary(int n) {


        String ans = "";
        for(int i = 1;i <= n;i++){
            ans = ans + Integer.toBinaryString(i);
        }
        ans = new StringBuilder(ans).reverse().toString();
        System.out.println(ans);
        int mod = (int)Math.pow(10,9)+7;
        long res = Long.parseLong(ans);
        long sum = 0, i= 0;
        while (res != 0){
            int last = (int)(res % 10);
            sum = (sum + (int)(last *Math.pow(2,i)))%mod;
            i++;
            res = res/10;
        }

        return (int)(sum % mod);
    }
}
