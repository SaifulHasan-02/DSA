package BinarySeach;

public class RBSWithDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,3};
        int target = 0;
        System.out.println(getPivotWithDuplicates(arr));
        //System.out.println(search(arr,target));
    }
    public static boolean search(int[] nums, int target) {
        if(nums.length==1){
            if(nums[0]==target){
                return true;
            }else return false;
        }
        int pivot = getPivotWithDuplicates(nums);
        if(pivot == -1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return true;
        }
        if(nums[0]<=target){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }
    public static boolean binarySearch(int[] arr,int target,int s,int e){

        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m]== target){
                return true;
            }
            else if(arr[m]>target){
                e = m-1;
            }else{
                s = m +1;
            }
        }
        return false;
    }
    public static int getPivotWithDuplicates(int[] arr){
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
            //when start,end,mid elements are same,then skip the start and end elements
            if(arr[s]==arr[m] && arr[m]==arr[e]){
                //Before skipping ,lets check whether s is pivot or not
                if( arr[s]>arr[s+1]){
                    return s;
                }
                s++;
                //Before skipping the last check whether e is pivot or not
                if(arr[e]<arr[e-1]){
                    return e-1;

                }else if(arr[e]>arr[e-1]){
                    return e;
                }
                e--;
            }
            //Left side is sorted then pivot is in the right side
            else if(arr[s]<arr[m] || (arr[s]==arr[m] && arr[m]>arr[e])){
                s = m+1;
            }else{
                e = m- 1;
            }
        }
        return -1;
    }
}
