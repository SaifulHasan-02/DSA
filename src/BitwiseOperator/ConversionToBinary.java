package BitwiseOperator;

public class ConversionToBinary {
    public static void main(String[] args) {
       // int n = 17;
       // binary(n);
       // octal(n);
       // hexaDecimal(n);
        System.out.println(binaryToDecimal(111));
    }
    //glt hai ye
    public static int  binaryToDecimal(int n){
        int base = 1;
        int sum = 0;
        while(n != 0){
            int last = n & 1;
            sum = sum + last*base;
            base = base * 2;
            n >>= 1;
        }
        return sum;
    }
    public static void binary(int n){
        String p ="";
        while(n != 0){
            int r = n % 2;
            p = r + p;
            n /= 2;
        }
        System.out.println(p);
    }
    public static void octal(int n){
        String p ="";
        while(n != 0){
            int r = n % 8;
            p = r + p;
            n /= 8;
        }
        System.out.println(p);
    }
    public static void hexaDecimal(int n){
        String p ="";
        while(n != 0){
            int r = n % 16;
            p = r + p;
            n /= 16;
        }
        System.out.println(p);
    }
}
