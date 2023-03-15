package BinarySeach;

public class PerfectSquare {
    public static void main(String[] args) {
        int num = 9;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num){ //O(log(n))
        int s = 1;
        int e = num;
        while (s<= e){
            int mid = s+(e-s)/2;
            int temp = mid*mid;
            if(temp == num) return true;

            else if(temp>num){
                e = mid-1;
            }else{
                s = mid +1;
            }
        }
        return false;
    }
}
