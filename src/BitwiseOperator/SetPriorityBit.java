package BitwiseOperator;

public class SetPriorityBit {
    public static void main(String[] args) {
        int n = 3;
        int count = countSet(n);
        System.out.println(count);
        if((count & 1) == 1){
            System.out.println("Need to add 1 in last of n,number of 1s is odd");
        }
        else
            System.out.println("No need to add 1,,number of 1s is even");
    }
    public static int countSet(int n){
        int count = 0;
        while(n != 0){
            if((n & 1) == 1){
                count ++;
            }
            n >>= 1;
        }
        return count;
    }
}
