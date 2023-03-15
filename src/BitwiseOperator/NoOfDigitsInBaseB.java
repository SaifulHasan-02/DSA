package BitwiseOperator;

public class NoOfDigitsInBaseB {
    public static void main(String[] args) {
        int n = 7;
        int b = 2;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(noOfdigits(n,b));
    }
    public static int noOfdigits(int n,int b){
        int count = (int)(Math.log(n)/Math.log(b))+1;
        return count;

    }
}
