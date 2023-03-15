package Array;

public class CountInversions {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5,6};
        System.out.println(getCount(arr));

//        System.out.println(countInversion(arr));

    }

    public static int getCount(int[]arr){
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int e:arr){
            if(e<max){
                count++;
            }
            max = Math.max(max,e);
        }
        return count;
    }

    private static int countInversion(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    count++;

                }
            }
        }
        return count;
    }

}
