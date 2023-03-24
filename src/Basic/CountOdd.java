package Basic;

public class CountOdd {
    public static void main(String[] args) {
        int low = 1;
        int high = 20;
        System.out.println(getCountOfOdd(low,high));
    }

    private static int getCountOfOdd(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if((i & 1) ==1){
                count++;
            }
        }
        return count;
    }
}
