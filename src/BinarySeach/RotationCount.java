package BinarySeach;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,3};
        System.out.println(getCount(arr));
    }

    private static int getCount(int[] arr) {
        int pivot = getPivot(arr);
        return pivot+1;
    }
    //without duplicates
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
    //with duplicates
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
