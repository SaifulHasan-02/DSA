package Array;

public class NoOfProductForDiscount {
    public static void main(String[] args) {
        int[] arr = {9,-13,-8,-7,-8,18,10};
        int discount = 18;

        System.out.println(noOfProduct(arr.length,arr,discount));
    }
    public static int noOfProduct(int n,int[] arr,int discount){
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(discount % arr[i] == 0){
                count++;
            }
        }
        return count;
    }
}
