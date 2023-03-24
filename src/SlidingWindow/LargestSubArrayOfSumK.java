package SlidingWindow;

public class LargestSubArrayOfSumK {
    public static void main(String[] args) {
        int[] arr = {4,1,1,1,2,3,5};
        int k = 5;
        System.out.println(getSubArrayLen(arr,k));
        System.out.println(getSubArrayLenPractice(arr,k));
    }
    public static int getSubArrayLenPractice(int[] arr,int target){
        int i =0;
        int j = 0;
        int sum = 0;
        int maxLen = 0;
        while (j<arr.length){
            sum += arr[j];
            if(sum<target){
                j++;
            }
            else if(sum == target){
                int curLen = j-i+1;
                if(maxLen<curLen){
                    maxLen = curLen;
                }
                j++;
            }
            else{
                while (sum > target){
                    sum = sum-arr[i];
                    i++;
                }
                j++;
            }
        }
        return maxLen;
    }

    public static int getSubArrayLen(int[] arr,int target){
        int i = 0;
        int j = 0;
        int maxLen = 0;
        int sum = 0;
        while (j<arr.length){
           sum += arr[j];

           if(sum < target){
               j++;
           }
           else if(sum == target){
               int curLen = j-i+1;
               if(maxLen< curLen){
                   maxLen = curLen;
               }
               j++;
           }
           else{
              while (sum > target){
                  sum = sum-arr[i];
                  i++;

              }
              j++;
           }


        }
        return maxLen;
    }
}
