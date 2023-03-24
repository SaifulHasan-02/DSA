package BinarySeach;

public class RSB {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        int target = 3;
        System.out.println(getPivot(arr));
        //System.out.println(search(arr,target));
    }
    public static int search(int[] nums, int target) {
        int pivot = getPivot(nums);
        if(pivot == -1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(nums[0]<=target){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }
    public static int binarySearch(int[] arr,int target,int s,int e){

        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m]== target){
                return m;
            }
            else if(arr[m]>target){
                e = m-1;
            }else{
                s = m +1;
            }
        }
        return -1;
    }
    public static int getPivot(int[] arr){
        int s =0;
        int e = arr.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(m<e && arr[m]>arr[m+1]){
                return m;
            }
            if(m>s && arr[m]<arr[m-1]){
                return m-1;
            }
            if(arr[s]>=arr[m]){
                e = m-1;
            }else{
                s = m+1;
            }
        }
        return -1;
    }
}
