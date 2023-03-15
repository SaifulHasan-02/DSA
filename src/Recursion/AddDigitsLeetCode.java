package Recursion;

public class AddDigitsLeetCode {
    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));

    }
    public static int addDigits(int num) {
        return getSum(num);

    }
    public static int getSum(int num){
        int sum = 0;
        while(num != 0){
            int r = num %10;
            sum = sum+ r;
            num /= 10;
        }
        if(noOfDigit(sum)>1){
            getSum(sum);
        }
        return sum;
    }
    public static int noOfDigit(int sum){
        int d =(int)(Math.log(sum)/Math.log(10))+1;
        System.out.println(d);
        return d;
    }
}
