package BitwiseOperator;

public class Power {
    public static void main(String[] args) {
        int base = 3;
        int power = 6;
        double res = getValue(base,power);
        System.out.println(res);
    }
    public static double getValue(int b,int p){
        double ans = 1.0;
        while(p != 0){
            if((p & 1) == 1)
                ans *= b;
            b *= b;
            p >>= 1;
        }
        return ans;
    }
}
