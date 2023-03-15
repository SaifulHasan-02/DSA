package BinarySeach;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,1,3};
        int target = 3;
        System.out.println(search(arr,0,arr.length-1,target));
        System.out.println(searchIte(arr,target));
    }
    public static int searchIte(int[] nums,int target){
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m]==target){
                return m;
            }
            if(nums[s]<=nums[m] ){
                if(nums[s]<=target && target<= nums[m]){
                    e = m-1;;

                }else{
                    s = m+1;
                }

            }
            else{
                if(nums[m]>target && target <= nums[e]){
                    e = m-1;
                }else if(nums[m]<target && nums[e]<target){
                    e = m-1;
                }else if(nums[m]<target && nums[s]>target){
                    s = m+1;
                }
            }
        }
        return -1;

    }
    public static int search(int[] arr,int s,int e,int target){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(arr[s] <= arr[m]){
            if(arr[s]<= target && target <= arr[m]){
                //e = m-1;
                return search(arr,s,m-1,target);
            }else{
                //s = m + 1;
                return search(arr,m+1,e,target);
            }
        }
        else{
            if(target >= arr[m] && target <= arr [e]){
                //s= m + 1;
                return search(arr,m+1,e,target);
            }else{
                //e = m - 1;
                return search(arr,s,m-1,target);
            }
        }
    }
}
