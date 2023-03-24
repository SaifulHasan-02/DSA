package BitwiseOperator;

public class NoOfSetBit {
    public static void main(String[] args) {
        int n = 5;
        int res = setBit(n);
        System.out.println(res);
        System.out.println(setBit2(n));
    }
    public static int setBit(int n){
        int count = 0;
        while(n != 0){
            if((n & 1) == 1){
                count++;
            }
            n >>= 1;
        }
        return count;
    }
    public static int setBit2(int n){
        int count = 0;
        while(n != 0){
            count ++;
            n = n & (n-1);
        }
        return count;
    }
}
