package BitwiseOperator;

public class AndWithOneOrZero {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(Integer.toBinaryString(n));
        //AND with "111" gives same digits
        n = n & 111;
        System.out.println(n);
        // AND with "000" gives zero
        n = n & 000;
        System.out.println(n);
        //XOR
        int a = 0;
        int b = 1;
        /*
        System.out.println(a^a);
        System.out.println(a^b);
        System.out.println(b^a);
        System.out.println(b^b);

         */
        //a^1 = !a
        //a^0 = a
        //a^a = 0

        int x = 10;
        System.out.println((x<<1));
        System.out.println((x>>1));

    }

}
