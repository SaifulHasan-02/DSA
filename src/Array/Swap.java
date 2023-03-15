package Array;

public class Swap {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
    /*
        x = x+y;
        y = x-y;
        x = x-y;

     */
        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println("x = "+x+" y = "+y );
        System.out.println(isPrme(5));
    }
    public static boolean isPrme(int n){
        int m = n;
        int i = 2;
        for(i =2;i<n;i++){
            if(n%i == 0){
                break;
            }
        }
        if(i == n)
            return true;
        return false;
    }
}
