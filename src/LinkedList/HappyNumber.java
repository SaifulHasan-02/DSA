package LinkedList;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
    /*
    private static boolean isHappy(int n) {
        int sum = 0;
        while(sum != 1){
            sum = 0;
            while(n != 0){
                int r = n % 10;
                sum += r*r;
                n /= 10;
            }
            System.out.print(sum+" ");
            n = sum;
            if(sum == 1){
                return true;
            }
        }
        return false;
    }
     */
    public static boolean isHappy(int n){
        int f = n;
        int s = n;

        do{
            s = getSum(s);  //5
            f = getSum(getSum(f));  //25
        }while(f != s);
        if(s == 1){
            return true;
        }
        return false;

    }

    private static int getSum(int n) {
        int sum = 0;
        while(n != 0){
            int r = n % 10;
            sum += r*r;
            n /= 10;
        }

        return sum;
    }
}
