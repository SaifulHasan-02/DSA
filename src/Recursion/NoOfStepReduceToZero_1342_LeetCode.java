package Recursion;

public class NoOfStepReduceToZero_1342_LeetCode {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(noOfSetps(n,0));
    }

    private static int noOfSetps(int n,int steps) {
        if(n== 0){
            return steps;
        }
        if((n&1) == 1){
            return noOfSetps(n-1,steps+1 );
        }else {
            return noOfSetps(n / 2, steps + 1);
        }
    }

}
