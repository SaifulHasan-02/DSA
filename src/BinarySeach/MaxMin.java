package BinarySeach;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {43,67,54,1,-56,-6,91};
        int L = 0;
        int R = arr.length-1;
        int max = getMax(arr,L,R);
        int min = getMin(arr,L,R);
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
    public static int getMin(int[] arr, int L,int R){
        if(L == R){
            return arr[L];
        }
        else if(R == L+1){
            return Math.min(arr[L],arr[R]);
        }
        else{
            int mid = L+(R-L)/2;
            int minL = getMin(arr,0,mid);
            int minR = getMin(arr,mid+1,R);
            return Math.min(minL,minR);
        }
    }
    public static int getMax(int[] arr,int L,int R){
        if(L == R){
            return arr[L];
        }
        else if(L+1 == R){
             return Math.max(arr[L],arr[R]);
        }
        else{
            int mid = L + (R-L)/2;
            int LMax = getMax(arr,0,mid);
            int RMax = getMax(arr,mid+1,R);
            return Math.max(LMax,RMax);
        }

    }
}
