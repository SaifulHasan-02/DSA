package BitwiseOperator;

public class IthBit {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(Integer.toBinaryString(n));
        //Find the set bits
        int i = 3;
        int res = n & (1<<(i-1));
        System.out.println(res);
        if(res == 0){
            System.out.println("0");
        }
        else
            System.out.println("1");
        /*
        //Set the set position  Bit
        int set = 3;
        int ans = n | (1<<(set-1));
        System.out.println(ans);
        System.out.println(Integer.toBinaryString(ans));

        //Reset the bit
        int x = 7;
        System.out.println(Integer.toBinaryString(x));
        int reset = 2;
        */
        /*
        int res = x & (!!(1<<(reset-1));
        System.out.println(res);
        System.out.println(Integer.toBinaryString(res));

         */
    }
}
