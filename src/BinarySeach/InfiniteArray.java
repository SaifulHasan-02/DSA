package BinarySeach;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10, 15, 17, 20, 26, 27, 30, 31, 32, 35, 40, 45, 47, 50, 55};
        int target = 15;
        //O(n)
       // System.out.println(getIndex(arr,target));
        //O(sqrt(n))
        System.out.println(getIndex2(arr,target));
    }
    public static int getIndex(int[] arr,int target){
        for(int i =0;;i++){
            if(arr[i]==target){
                return i;
            }
        }
    }
    public static int getIndex2(int[] arr,int target){
        int start = 0;
        int end = 1;
        while (target > arr[end]){
            start = end+1;
            end = 2*start +1;

        }
        return bsearch(arr,target,start,end);
    }
    public static int bsearch(int[] arr,int target,int s,int e){
        //Recursion
        if(s > e)
            return -1;
        int m = s+(e-s)/2;
        if(arr[m] == target)
            return m;
        else if(arr[m] > target)
            return bsearch(arr,target,s,m-1);
        else
            return bsearch(arr,target,m+1,e);

        /*
        //Iteration
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target){
                e = mid-1;
            }
            else
                s = mid+1;

        }
        return -1;

         */
    }

}
