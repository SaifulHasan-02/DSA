package Array;

public class CountEvenSum {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int k = 2;
        System.out.println(countEvenSum(arr,k));
    }
    public static int countEvenSum(int[]arr,int k){
        int count = 0;
        int i =0,j =0,n = arr.length;
        while (j<n){
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                int sum = 0,ind = i;
                for (;ind<=j;ind++)
                    sum+=arr[ind];

                if(sum%2 == 0)
                    count++;
                i++;
                j++;
            }
        }
        return count == 0 ?-1 : count;
    }
}
