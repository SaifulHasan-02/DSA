package Basic;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int n = 50;
        //System.out.println(getfac(n));
        System.out.println(getfact2(n));
    }

    private static BigInteger getfact2(int n) {
        BigInteger ans = new BigInteger(String.valueOf(1));
        for (int i = 1;i<=n;i++){
            ans = ans.multiply(BigInteger.valueOf(Long.parseLong(String.valueOf(i))));
        }
       return ans;
    }

    private static int getfac(int n) {
        if(n == 0 || n == 1){
            return 1;
        }
        int f = 1;
        for (int i = 1; i <=n; i++) {
            f = f*i;
        }
        return f;
    }

}
