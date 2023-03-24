package BitwiseOperator;

public class OddEven {
    public static void main(String[] args) {
        int n = 1000;
        if((n & 1) == 1)
            System.out.println("ODD Number");
        else if((n & 1) == 0)
            System.out.println("Even Number");
        else
            System.out.println("Plz,insert valid input");
    }
}
