package LeetCode;
//Question no. 191
public class NumberOfSetBits {
    public static void main(String[] args) {
        int n = -3;
        System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n){
        int count = 0;
        while(n != 0){
            if((n & 1) == 1){
                count++;
            }
            n >>>= 1;
        }
        return count;
    }
}
