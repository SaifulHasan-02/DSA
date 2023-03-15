package Array;

public class CandyDistribute {
    public static void main(String[] args) {
        /*
        int n = 10;
        System.out.println(getCandy(n));
        System.out.println(sumOfEven(n));



        int[] A = {1,3,2,4};
        int n = A.length;
        int[] B = {4,2,4};
        int m = B.length;

        System.out.println(getLenOfSameArray(n,A,m,B));

         */

        int n = 37;


    }
    public static int getLenOfSameArray(int n,int[] A,int m ,int[] B){
        int i = 0;
        int j = 1;
       return 0;
    }
    public static   int getCandy(int n){
        if(n%2 == 0){
            return n/2;
        }
        return (n-1)/2;

    }
    public static int sumOfEven(int n){
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            if(i%2 == 0){
                sum = sum +i;
            }
        }
        return sum;
    }
}
