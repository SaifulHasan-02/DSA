package Recursion;

public class NoOfZero {
    public static void main(String[] args) {
        int n = 1002307;
        System.out.println(noOfZero(n));
    }
    public static int noOfZero(int n){
        if(n == 0){
            return 0;
        }
        if(n%10 == 0){
            return 1+noOfZero(n/10);
        }else{
            return noOfZero(n/10);
        }
    }
}
