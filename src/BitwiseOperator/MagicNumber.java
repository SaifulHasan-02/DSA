package BitwiseOperator;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 4;
        int magic = getMagic(n);
        System.out.println(magic);
    }
    public static int getMagic(int n){ //amazon
        int base = 5;
        int sum = 0;
        while(n != 0){
            int last = n & 1;
            sum = sum + last*base;
            base = base*5;
            n >>= 1;
        }
        return sum;
    }

}
