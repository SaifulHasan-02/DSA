package Array;

public class SumOfSquareOfInteger {
    public static void main(String[] args) {
        int n = 109;
        System.out.println(isSumOfSquareOfInteger(n));
    }
    public static boolean isSumOfSquareOfInteger(int n){

        int start = 0;
        int end = (int)Math.sqrt(n);

        while (start < end){
            int res = start*start + end*end;

            if(res == n){
                System.out.println(start+" "+start*start);
                System.out.println(end+" "+end*end);
                return true;
            }
            else if(res > n) end--;

            else start++;
        }
        return false;

    }
}
