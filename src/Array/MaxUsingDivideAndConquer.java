package Array;

public class MaxUsingDivideAndConquer {
    public static void main(String[] args) {
        int[] arr = {100,10,5,15,30,20,40,7};
        System.out.println(getMax(arr));
        System.out.println(getMin(arr));
    }
    public static int getMax(int[]arr){
        return max(arr,0,arr.length-1);
    }
    public static int max(int[]arr,int start,int end){
        if(start == end){
            return arr[start];
        }
        else if(end == start + 1){
            return Math.max(arr[start], arr[end]);
        }
        int mid = start + (end - start)/2;

        int leftMax = max(arr,start,mid);
        int rightMax = max(arr,mid+1,end);

        return Math.max(leftMax,rightMax);
    }
    public static int getMin(int[]arr){
        return min(arr,0,arr.length-1);
    }
    public static int min(int[] arr,int st,int end){
        if(st == end){
            return arr[st];
        }
        else if(end == st + 1){
            return Math.min(arr[st],arr[end]);
        }
        int mid = st + (end - st)/2;

        int leftMin = min(arr,st,mid);
        int rightMin = min(arr,mid+1,end);

        return Math.min(leftMin,rightMin);
    }
}
