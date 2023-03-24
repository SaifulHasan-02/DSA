package BitwiseOperator;

public class CheckPowerOf2 {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(checkPower2(n));
    }
    public static boolean checkPower2(int n){
        if((n & (n-1))==0){
            return true;
        }
        else
            return false;
    }
}
