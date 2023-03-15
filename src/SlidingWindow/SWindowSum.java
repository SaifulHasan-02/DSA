package SlidingWindow;

public class SWindowSum {
    public static void main(String[] args) {
        int[] arr = {2,5,1,8,2,9,1};
        int k = 3;
        System.out.println(getMax(arr,k));
        System.out.println(getMaxOpt(arr,k));
    }

    private static int getMaxOpt(int[] arr, int k) {
        int max = 0;
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i<=j && j<arr.length){
            if((j-i+1) <k ){
                sum=sum+ arr[j];
                j++;
            }
            else if(j-i+1 == k) {
                max = (int) Math.max(max, sum);
                i++;
                j++;
            }


        }



        return max;
    }

    public static int getMax(int[] arr,int k){
        int max = 0;
        for (int i = 0; i <= arr.length-k; i++) {
            int sum = 0;
            for (int j = i; j <k+i ; j++) {
                sum = sum + arr[j];
            }
            if(sum>max){
                max = sum;
            }

        }

        return max;
    }


}
