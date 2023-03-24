package Array;

public class PeekElementGfG {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(peekElement(arr, arr.length));

    }

    private static int peekElement(int[] arr, int n) {
        int s = 0;
        int e = n-1;
        while(s < e){
            int m = s+(e-s)/2;
            if((m<e && arr[m] > arr[m+1]) || (arr[m] > arr[m-1] && s>0)){
                return 1;
            }
            else if(m<e &&arr[m]<arr[m+1]){
                s = m+1;
            }
            else if(s> 0 && arr[m] < arr[m-1]){
                e = m-1;
            }
        }
        return 0;
    }
}
